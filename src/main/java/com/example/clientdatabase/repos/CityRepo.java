package com.example.clientdatabase.repos;

import com.example.clientdatabase.domain.City;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends CrudRepository<City, Long> {


    City findById(int id);


}
