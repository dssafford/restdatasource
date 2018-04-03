package com.doug.service;

import com.doug.model.Answer;

import java.util.List;

public interface AnswerService {

//    Iterable<Answer> findAllById(Long id);

    List<String> getAnswers(Integer Id);

        void addAnswer(Answer answer);


}
