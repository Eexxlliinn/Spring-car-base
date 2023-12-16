package com.example.springcarbase.repositories;

import com.example.springcarbase.entities.Car;
import com.example.springcarbase.entities.Driver;
import com.example.springcarbase.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends CrudRepository<Driver, Long> {

    Driver findByUser(User user);
}
