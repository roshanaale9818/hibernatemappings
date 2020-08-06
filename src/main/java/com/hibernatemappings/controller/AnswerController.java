package com.hibernatemappings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hibernatemappings.model.Answer;
import com.hibernatemappings.service.AnswerService;

@RestController
public class AnswerController {
	@Autowired
	private AnswerService answerService;
	@GetMapping("/products/{id}")
	public List<Answer> get(){
		return answerService.listAll();
	}
}
