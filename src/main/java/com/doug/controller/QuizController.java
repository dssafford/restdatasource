package com.doug.controller;

import com.doug.model.Answer;
import com.doug.model.City;
import com.doug.model.Quiz;
import com.doug.repository.QuizRepository;
import com.doug.service.CityService;
import com.doug.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuizController {

    @Autowired
    QuizService quizService;

    @Autowired
    QuizRepository quizRepository;

    @CrossOrigin
    @RequestMapping(value = "/api/getSome", method = RequestMethod.GET)
    public Iterable getQuizIdandComments() {

        Iterable<Quiz> myQuizzes= quizService.getQuizIdandComments();
        return myQuizzes;
    }

    @CrossOrigin
    @RequestMapping(value = "/api/QuizList", method = RequestMethod.GET)
    public Iterable list() {
        Iterable<Quiz> myQuizzes= quizService.getAllResults();
        return myQuizzes;
    }

    @CrossOrigin
    @RequestMapping(value = "/api/OneQuiz/{id}", method = RequestMethod.GET)
    public Quiz OneQuiz(@PathVariable("id") int id){

        return quizService.getOneResult(id);
    }

//    @CrossOrigin
//    @RequestMapping(value = "/api/Quiz", method = RequestMethod.POST)
//    public void AddQuiz(@RequestBody Quiz quiz) {
//
//        quizService.addQuiz(quiz, new Answer());
//    }

    @CrossOrigin
    @RequestMapping(value = "/api/deleteQuiz", method = RequestMethod.GET)
    public void DeleteQuiz() {

        quizRepository.delete(4);
    }


    @CrossOrigin
    @RequestMapping(value = "/api/addQuiz", method = RequestMethod.GET)
    public void AddFakeQuiz() {

//        quizService.addQuiz(quiz);*/

        Quiz quiz = new Quiz(2, 85, "dude comments here");

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



}
