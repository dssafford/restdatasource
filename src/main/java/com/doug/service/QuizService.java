package com.doug.service;

import com.doug.model.City;
import com.doug.model.Quiz;

public interface QuizService {

    Iterable<Quiz> getAllResults();

     void addQuiz(Quiz quiz);

}
