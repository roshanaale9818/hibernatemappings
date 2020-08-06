package com.hibernatemappings.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernatemappings.model.Answer;
import com.hibernatemappings.model.Question;
import com.hibernatemappings.repository.AnswerRepository;

@Service
public class AnswerService {
	@Autowired
	AnswerRepository answerRepository;
	public List<Answer> listAll(){
		return (List<Answer>) answerRepository.findAll();
	}
	public Optional<Answer> listById(Integer id) {
		return answerRepository.findById(id);
	}
	public void delete(Integer id) {
		answerRepository.deleteById(id);
	}
	

}
