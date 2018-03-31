package com.doug.service;

import com.doug.model.Answer;
import com.doug.model.Quiz;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface QuizService {

//    @Query("select s.id, s.name from School s")

    Iterable<Quiz> getQuizIdandComments();

    Quiz getOneResult(Integer id);

    Iterable<Quiz> getAllResults();

//    void addQuiz(Quiz quiz);

//    void addQuiz(Quiz quiz, Answer answer);

    void addSampleQuizData();

}