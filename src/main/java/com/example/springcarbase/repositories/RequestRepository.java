package com.example.springcarbase.repositories;

import com.example.springcarbase.entities.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends CrudRepository<Request, Long> {
}
