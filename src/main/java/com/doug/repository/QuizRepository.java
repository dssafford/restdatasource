package com.doug.repository;

import com.doug.model.City;
import com.doug.model.Quiz;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface QuizRepository extends CrudRepository<Quiz, Integer> {

    List<Quiz> findAll();

}
