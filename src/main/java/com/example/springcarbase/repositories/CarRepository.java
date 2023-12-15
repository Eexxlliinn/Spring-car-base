package com.example.springcarbase.repositories;

import com.example.springcarbase.entities.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
    List<Car> findByStatus(String status);
}
