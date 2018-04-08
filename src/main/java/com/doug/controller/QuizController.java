package com.doug.controller;

import com.doug.model.Answer;
import com.doug.model.Book;
import com.doug.model.Quiz;
import com.doug.repository.QuizRepository;
import com.doug.service.QuizService;
import com.sun.xml.internal.xsom.impl.scd.Iterators;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class QuizController {

    @Autowired
    QuizService quizService;

    @Autowired
    QuizRepository quizRepository;

//    @CrossOrigin
//    @RequestMapping(value = "/api/getSome", method = RequestMethod.GET)
//    public Iterable getQuizIdandComments() {
//
//        Iterable<Quiz> myQuizzes= quizService.getQuizIdandComments();
//        return myQuizzes;
//    }


//    @CrossOrigin
//    @RequestMapping(value = "/api/bookList", method = RequestMethod.GET)
//    public Iterable list() {
//
//
//        Iterable<Book> myBooks = bookService.getAllBooks();
//
////        model.addAttribute("books", myBooks);
//
//        return myBooks;
//    }

    @CrossOrigin
    @RequestMapping(value = "/api/QuizList", method = RequestMethod.GET)
    public Iterable list() {
        Iterable<Quiz> myQuizzes= quizService.getAllQuizzes();

        return myQuizzes;
    }

    @CrossOrigin
    @RequestMapping(value = "/api/answerList", method = RequestMethod.GET)
    public Iterable answerList() {
        Iterable<Answer> myAnswers = quizService.getAllAnswers();

        return myAnswers;
    }



    @CrossOrigin
    @RequestMapping(value = "/api/OneQuiz/{id}", method = RequestMethod.GET)
    public Quiz OneQuiz(@PathVariable("id") int id){

        return quizService.getOneResult(id);
    }

    @CrossOrigin
    @RequestMapping(value = "/api/Quiz", method = RequestMethod.POST)
    public void getQuiz(@RequestBody Quiz quiz) {

        this.MapObjects(quiz);

//        quizService.addQuiz(quiz);
    }


    @CrossOrigin
    @RequestMapping(value = "/api/Quiz", method = RequestMethod.OPTIONS)
    public void AddQuiz(@RequestBody Quiz quiz) {

        quizService.addQuiz(quiz);
    }

    @CrossOrigin
    @RequestMapping(value = "/api/deleteQuiz", method = RequestMethod.GET)
    public void DeleteQuiz() {

//        quizRepository.delete(4);
    }

//    @CrossOrigin
//    @RequestMapping(value = "/api/getQuiz", method = RequestMethod.GET)
//    public void getQuizzes() {
//
////        Iterable<Quiz> quizzes = quizRepository.findAll();
//        System.out.println(quizService.getAllResults());
//
//
//
//    }


    @CrossOrigin
    @RequestMapping(value = "/api/addQuiz", method = RequestMethod.GET)
    public void AddFakeQuiz() {

        Quiz quiz = new Quiz(12, 85, "dude comments here",
                new Date());

        Answer myAnswer1 = new Answer();
        myAnswer1.setQuestion(1);
        myAnswer1.setAnswer(1);
        myAnswer1.setCorrect(true);
        myAnswer1.setComments("comments in answer here");
        myAnswer1.setQuiz(quiz);

        Answer myAnswer2 = new Answer();
        myAnswer2.setQuestion(1);
        myAnswer2.setAnswer(1);
        myAnswer2.setCorrect(true);
        myAnswer2.setComments("comments in answer here");
        myAnswer2.setQuiz(quiz);

        Set<Answer> myAnswerArray = new HashSet<Answer>();

        myAnswerArray.add(myAnswer1);
        myAnswerArray.add(myAnswer2);

        quiz.setAnswers(myAnswerArray);

        quizRepository.save(quiz);


//        quizRepository.delete(4);




    }

    private void MapObjects(Quiz quiz) {

        Quiz newQuiz = new Quiz();
        Set<Answer> mynewAnswers = new HashSet<>();


        Set<Answer> answers = quiz.getAnswers();

        //Iterator<Answer> iterator = answers.iterator();
        for (Answer answer : answers) {
            System.out.println(answer.getQuestion());

            Answer myAnswer1 = new Answer();
            myAnswer1.setQuestion(answer.getQuestion());
            myAnswer1.setQuestion(answer.getQuestion());
            myAnswer1.setCorrect(answer.getCorrect());
            myAnswer1.setComments(answer.getComments());
//            myAnswer1.setQuiz(newQuiz);

            mynewAnswers.add(myAnswer1);
        }


//        newQuiz.getAnswers().add(myAnswer2);

        newQuiz.setAnswers(mynewAnswers);

        quizRepository.save(newQuiz);

    }



}
