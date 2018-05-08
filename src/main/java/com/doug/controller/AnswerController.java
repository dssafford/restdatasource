package com.doug.controller;

import com.doug.model.Answer;
import com.doug.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnswerController {

    @Autowired
    AnswerService answerService;

    @CrossOrigin
    @RequestMapping(value = "/api/getAnswers/{id}", method = RequestMethod.GET)
    public List<String> getAnswers(@PathVariable("id") Integer id) {

        return answerService.getAnswers(id);
    }

    @CrossOrigin
    @RequestMapping(value = "/api/Answer", method = RequestMethod.POST)
    public void AddQuiz(@RequestBody Answer answer) {

        answerService.addAnswer(answer);
    }

//    @CrossOrigin
//    @RequestMapping(value = "/api/textAnswer/{id}", method = RequestMethod.POST)
//    public void getLorayneAnswer(@RequestBody Answer answer) {
//
//        return answerService.getLorayneAnswer(answer);
//    }

}
