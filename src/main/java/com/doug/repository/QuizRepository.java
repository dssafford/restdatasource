package com.doug.repository;

import com.doug.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz, Integer> {

//    List<Quiz> findAll();

//    @Query("select id, numberOfQuestions, score, date_added, comments  from Quiz")
//    Iterable<Quiz> getQuizIdandComments();


}
