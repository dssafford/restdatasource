package com.doug.repository;

import com.doug.model.Answer;
import com.doug.model.Quiz;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


public interface AnswerRepository extends CrudRepository<Answer, Integer> {

//    @Query("select id, numberOfQuestions, score, date_added, comments  from Quiz")
//    Iterable<Answer> getQuizIdandComments();

//    @Query(value = "select a.id, a.question  from answer a where a.quiz_id = ?1", nativeQuery = true)
//    Iterable<Answer> getAnswersWithId(Integer id);



//    @Query("SELECT a FROM Answer a where a.quiz_id = :quiz_id ")
//    public List<Answer> findByQuiz_Id(@Param("quiz_id") Integer id);


    //    void addQuiz(Quiz quiz);

//    void addQuiz(Quiz quiz, Answer answer);

}
