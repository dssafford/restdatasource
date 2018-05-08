package com.doug.service;

import com.doug.model.Answer;
import com.doug.model.Quiz;
import com.doug.model.QuizSingle;

public interface QuizSingleService {

//    @Query("select s.id, s.name from School s")

//    Iterable<Quiz> getQuizIdandComments();

    QuizSingle getOneResult(Integer id);

    Iterable<QuizSingle> getAllSingleQuizzes();

    void addSingleQuiz(QuizSingle quiz);

}