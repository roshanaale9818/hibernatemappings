package com.hibernatemappings.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernatemappings.model.Question;
import com.hibernatemappings.service.QuestionService;


@RestController
@RequestMapping("/questions")
public class QuestionController {
	 @Autowired
	 QuestionService questionService;
	 
	 @GetMapping
	 public List<Question> getAll(){
		 return questionService.listAll();
	 }
	 @GetMapping("{id}")
	 public ResponseEntity<Question> get(@PathVariable Integer id){
		 try {
			 Question question = questionService.getById(id);
			 return new ResponseEntity<Question>(question,HttpStatus.OK);
		 }
		 catch(NoSuchElementException e) {
				return new ResponseEntity<Question>(HttpStatus.NOT_FOUND);
			}
	 }
	 @PostMapping
	 public void add(@RequestBody Question question) {
		 questionService.save(question);
	 }
	 @PutMapping("/questions/{id}")
	 public ResponseEntity<?> update(@RequestBody Question question,@PathVariable Integer id){
		 try {
			 Question existQuestion  = questionService.getById(id);
			 questionService.save(question);
			 return new ResponseEntity<Question>(HttpStatus.OK);
		 }
		 catch(NoSuchElementException e) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);		
		}
		 
	 }
	 
	 @DeleteMapping("{id}")
	 public void delete(@PathVariable Integer id) {
			questionService.delete(id);
		}
	 
	 
	 

}
