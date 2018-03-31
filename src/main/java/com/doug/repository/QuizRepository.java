package com.doug.repository;

import com.doug.model.Quiz;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface QuizRepository extends CrudRepository<Quiz, Integer> {

    List<Quiz> findAll();

    @Query("select id, numberOfQuestions, score, date_added, comments  from Quiz")
    Iterable<Quiz> getQuizIdandComments();


}
