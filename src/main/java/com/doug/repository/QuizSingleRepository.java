package com.doug.repository;

import com.doug.model.QuizSingle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizSingleRepository extends JpaRepository<QuizSingle, Integer> {

//    List<Quiz> findAll();

//    @Query("select id, numberOfQuestions, score, date_added, comments  from Quiz")
//    Iterable<Quiz> getQuizIdandComments();


}
