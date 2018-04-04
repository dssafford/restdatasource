package com.doug.controller;

import com.doug.model.Answer;
import com.doug.model.Quiz;
import com.doug.repository.QuizRepository;
import com.doug.service.QuizService;
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

    @CrossOrigin
    @RequestMapping(value = "/api/QuizList", method = RequestMethod.GET)
    public Iterable list() {
        Iterable<Quiz> myQuizzes= quizService.getAllResults();

        ArrayList<Quiz> returnQuizzes = new ArrayList<>();
        Quiz newQuiz;

        for (int i = 0; i< ((Collection<?>) myQuizzes).size();i++) {
            newQuiz = new Quiz(myQuizzes.iterator().next().getScore(),myQuizzes.iterator().next().getNumberOfQuestions(),
                    myQuizzes.iterator().next().getComments());
            newQuiz.setId(myQuizzes.iterator().next().getId());
            newQuiz.setDate_added(myQuizzes.iterator().next().getDate_added());
            returnQuizzes.add(newQuiz);

        }

        return returnQuizzes;
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

    @CrossOrigin
    @RequestMapping(value = "/api/getQuiz", method = RequestMethod.GET)
    public void getQuizzes() {

        List<Quiz> quizzes = quizRepository.findAll();
        System.out.println(quizzes.toString());


    }


    @CrossOrigin
    @RequestMapping(value = "/api/addQuiz", method = RequestMethod.GET)
    public void AddFakeQuiz() {

        Quiz quiz = new Quiz(12, 85, "dude comments here");

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

        quiz.getAnswers().add(myAnswer1);
        quiz.getAnswers().add(myAnswer2);

        quizRepository.save(quiz);


//        quizRepository.delete(4);




    }

    private void MapObjects(Quiz quiz) {

        Quiz newQuiz = new Quiz(quiz.getNumberOfQuestions(), quiz.getScore(), quiz.getComments());
        List<Answer> mynewAnswers = new ArrayList<>();


        List<Answer> answers = quiz.getAnswers();

        //Iterator<Answer> iterator = answers.iterator();
        for (Answer answer : answers) {
            System.out.println(answer.getAnswer());

            Answer myAnswer1 = new Answer();
            myAnswer1.setQuestion(answer.getQuestion());
            myAnswer1.setAnswer(answer.getAnswer());
            myAnswer1.setCorrect(answer.getCorrect());
            myAnswer1.setComments(answer.getComments());
            myAnswer1.setQuiz(newQuiz);

            mynewAnswers.add(myAnswer1);
        }


//        newQuiz.getAnswers().add(myAnswer2);

        newQuiz.setAnswers(mynewAnswers);

        quizRepository.save(newQuiz);

    }



}
