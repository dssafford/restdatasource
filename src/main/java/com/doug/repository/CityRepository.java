package com.doug.repository;

import com.doug.model.City;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CityRepository extends CrudRepository<City, Integer> {

    List<City> findAll();

}
