package com.doug.service;

import com.doug.model.Answer;
import com.doug.model.Location;
import com.doug.model.Quiz;
import com.doug.repository.AnswerRepository;
import com.doug.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizServiceImpl implements QuizService{

    @Autowired
    QuizRepository quizRepository;

    @Autowired
    AnswerRepository answerRepository;

//    @Override
//    public Iterable<Location> getAllLocations() {
//
//
//        return locationRepository.findAll();
//    }
    @Override
    public Iterable<Quiz> getAllQuizzes() {

        return quizRepository.findAll();
    }

    @Override
    public Iterable<Answer> getAllAnswers() {

        return answerRepository.findAll();
    }

    @Override
    public Quiz getOneResult(Integer id) {

//         Quiz myquiz = quizRepository.findOne(id);
        return null;
    }

//    @Override
//    public Iterable<Quiz> getQuizIdandComments() {
//
//        return quizRepository.getQuizIdandComments();
//    }

    @Override
    public void addSampleQuizData() {


//        Quiz quiz = new Quiz(4, 80, "dude comments here");
//
//        Answer myAnswer1 = new Answer();
//        myAnswer1.setQuestion(1);
//        myAnswer1.setAnswer(1);
//        myAnswer1.setCorrect(true);
//        myAnswer1.setComments("comments in answer here");
//        myAnswer1.setQuiz(quiz);
//
//        Answer myAnswer2 = new Answer();
//        myAnswer1.setQuestion(1);
//        myAnswer1.setAnswer(1);
//        myAnswer1.setCorrect(true);
//        myAnswer1.setComments("comments in answer here");
//        myAnswer1.setQuiz(quiz);
//
//        quiz..getAnswers().add(myAnswer1);
//        quiz.getAnswers().add(myAnswer2);

//        quizRepository.save(quiz);

//        quizRepository.delete(4);

    }

    @Override
    public void addQuiz(Quiz quiz){

        quizRepository.save(quiz);
    }

    private Quiz compileResults(Quiz myQuiz) {

//
//        Answer myAnswer1  = new Answer();
//        myAnswer1.setQuestion(); = 1;
//        myAnswer1.setAnswer(); = 1;
//        myAnswer1.setCorrect(); = 1;
//        myAnswer1.setComments(); = 'comments in answer here';
//
//        myAnswer1.setQuiz(myQuiz);
//
//        myAnswer2: Answer = new Answer();
//        myAnswer2.setQuestion(1);
//        myAnswer2.setAnswer(1);
//        myAnswer2.setCorrect(true);
//        myAnswer2.setComments('comments in answer here');
//        myAnswer2.setQuiz(myQuiz);
//
//        quiz.getAnswers().add(myAnswer1);
//        quiz.getAnswers().add(myAnswer2);
        return null;
    }
}
