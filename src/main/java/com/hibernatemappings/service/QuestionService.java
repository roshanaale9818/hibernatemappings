package com.hibernatemappings.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernatemappings.model.Question;
import com.hibernatemappings.repository.QuestionRepository;

@Service
public class QuestionService {
	@Autowired
	private QuestionRepository questionRepository ;

	public List<Question> listAll(){
		return (List<Question>) questionRepository.findAll();
	}
	
	public void save(Question question) {
		questionRepository.save(question);
	}
	public Question getById(Integer id) {
		return questionRepository.findById(id).get();
	}
	public void delete(Integer id ) {
		questionRepository.deleteById(id);
	}
	

}
