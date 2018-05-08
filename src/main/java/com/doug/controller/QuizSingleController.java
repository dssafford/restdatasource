package com.doug.controller;

import com.doug.model.QuizSingle;
import com.doug.repository.QuizSingleRepository;
import com.doug.service.QuizSingleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class QuizSingleController {

    @Autowired
    QuizSingleService quizSingleService;

    @Autowired
    QuizSingleRepository quizSingleRepository;

    @CrossOrigin
    @RequestMapping(value = "/api/QuizSingleList", method = RequestMethod.GET)
    public Iterable list() {
        Iterable<QuizSingle> myQuizzes= quizSingleService.getAllSingleQuizzes();

        return myQuizzes;
    }


//    @CrossOrigin
//    @RequestMapping(value = "/api/OneQuiz/{id}", method = RequestMethod.GET)
//    public Quiz OneQuiz(@PathVariable("id") int id){
//
//        return quizService.getOneResult(id);
//    }

    @CrossOrigin
    @RequestMapping(value = "/api/addSingleQuiz", method = RequestMethod.POST)
    public void getQuiz(@RequestBody QuizSingle quiz) {
        quizSingleRepository.save(quiz);
    }


//    @CrossOrigin
//    @RequestMapping(value = "/api/Quiz", method = RequestMethod.OPTIONS)
//    public void AddQuiz(@RequestBody Quiz quiz) {
//
//        quizService.addQuiz(quiz);
//    }
//
//    @CrossOrigin
//    @RequestMapping(value = "/api/deleteQuiz", method = RequestMethod.GET)
//    public void DeleteQuiz() {
//
////        quizRepository.delete(4);
//    }

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
    @RequestMapping(value = "/api/addFakeSingleQuiz", method = RequestMethod.GET)
    public QuizSingle AddFakeQuizSingle() {

        QuizSingle quiz = new QuizSingle(12, "tot",
                "fake single comments here",
                new Date());

        quizSingleRepository.save(quiz);
        return quiz;

    }

//    private void MapObjects(Quiz quiz) {
//
//        Quiz newQuiz = new Quiz();
//        ArrayList<Answer> mynewAnswers = new ArrayList<>();
//
//
//        List<Answer> answers = quiz.getAnswers();
//
//        //Iterator<Answer> iterator = answers.iterator();
//        for (Answer answer : answers) {
//            System.out.println(answer.getQuestion());
//
//            Answer myAnswer1 = new Answer();
//            myAnswer1.setQuestion(answer.getQuestion());
//            myAnswer1.setQuestion(answer.getQuestion());
//            myAnswer1.setCorrect(answer.getCorrect());
//            myAnswer1.setComments(answer.getComments());
////            myAnswer1.setQuiz(newQuiz);
//
//            mynewAnswers.add(myAnswer1);
//        }
//
//
////        newQuiz.getAnswers().add(myAnswer2);
//
//        newQuiz.setAnswers(mynewAnswers);
//
//        quizRepository.save(newQuiz);
//
//    }



}
