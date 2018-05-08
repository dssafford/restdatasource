package com.doug.service;

import com.doug.model.QuizSingle;
import com.doug.repository.QuizSingleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizSingleServiceImpl implements QuizSingleService {

    @Autowired
    QuizSingleRepository quizSingleRepository;

    @Override
    public Iterable<QuizSingle> getAllSingleQuizzes() {

        return quizSingleRepository.findAll();
    }

    @Override
    public void addSingleQuiz(QuizSingle quiz) {
        quizSingleRepository.save(quiz);
    }





    @Override
    public QuizSingle getOneResult(Integer id) {
        QuizSingle myquiz = quizSingleRepository.getOne(id);
        return myquiz;   }

}
