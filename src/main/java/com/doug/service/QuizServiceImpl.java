package com.doug.service;

import com.doug.model.City;
import com.doug.model.Quiz;
import com.doug.repository.CityRepository;
import com.doug.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizServiceImpl implements QuizService{

    @Autowired
    QuizRepository quizRepository;

    @Override
    public Iterable<Quiz> getAllResults() {


        return quizRepository.findAll();
    }

    @Override
    public void addQuiz(Quiz quiz) {

        quizRepository.save(quiz);

    }
}
