package com.hibernatemappings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.hibernatemappings.model.Question;

public interface QuestionRepository extends CrudRepository<Question,Integer> {

}
