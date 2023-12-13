package com.example.springcarbase.repositories;

import com.example.springcarbase.entities.Driver;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends CrudRepository<Driver, Long> {
}
