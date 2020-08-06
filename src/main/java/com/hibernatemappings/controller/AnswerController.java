package com.hibernatemappings.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernatemappings.model.Answer;
import com.hibernatemappings.service.AnswerService;

@RestController
@RequestMapping("/answers")
public class AnswerController {
	@Autowired
	private AnswerService answerService;
	@GetMapping("{questionId}")
	public Optional<Answer> get(@PathVariable Integer questionId){
		return answerService.listAllByQuestionId(questionId);
	}
	@PostMapping("{questionId}")
	public void postAnswer(@PathVariable Integer questionId, @RequestBody Answer answer) {
		answerService.save(questionId, answer);
	}
}
