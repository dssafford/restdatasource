package com.doug.repository;

import com.doug.model.Answer;

import org.springframework.data.jpa.repository.JpaRepository;



public interface AnswerRepository extends JpaRepository<Answer, Integer> {

//    @Query("select id, numberOfQuestions, score, date_added, comments  from Quiz")
//    Iterable<Answer> getQuizIdandComments();

//    @Query(value = "select a.id, a.question  from answer a where a.quiz_id = ?1", nativeQuery = true)
//    Iterable<Answer> getAnswersWithId(Integer id);



//    @Query("SELECT a FROM Answer a where a.quiz_id = :quiz_id ")
//    public List<Answer> findByQuiz_Id(@Param("quiz_id") Integer id);


    //    void addQuiz(Quiz quiz);

//    void addQuiz(Quiz quiz, Answer answer);

}
