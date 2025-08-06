package com.xits.firstclaas.Relatives;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface relativsRepository extends CrudRepository<Relatives,Integer> {
    List<Relatives>findByName(String name);
}
