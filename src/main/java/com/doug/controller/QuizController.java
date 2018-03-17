package com.doug.controller;

import com.doug.model.City;
import com.doug.model.Quiz;
import com.doug.service.CityService;
import com.doug.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuizController {

    @Autowired
    QuizService quizService;

    @CrossOrigin
    @RequestMapping(value = "/api/QuizList", method = RequestMethod.GET)
    public Iterable list() {


        Iterable<Quiz> myQuizzes= quizService.getAllResults();

//        model.addAttribute("quizzes", myQuizzes);

        return myQuizzes;
    }



    @CrossOrigin
    @RequestMapping(value = "/api/Quiz", method = RequestMethod.POST)
    public void AddQuiz(@RequestBody Quiz quiz) {

        quizService.addQuiz(quiz);
    }


}
