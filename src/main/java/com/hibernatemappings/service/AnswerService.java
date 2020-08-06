package com.hibernatemappings.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibernatemappings.model.Answer;
import com.hibernatemappings.model.Question;
import com.hibernatemappings.repository.AnswerRepository;
import com.hibernatemappings.repository.QuestionRepository;

@Service
public class AnswerService {
	@Autowired
	AnswerRepository answerRepository;
	@Autowired
	QuestionRepository questionRepository;
	
	public void save(Integer questionId,Answer answer) {
			questionRepository.findById(questionId).map(quest ->{
			//we get the questionId here and setQuestion to quest for foreign key
			answer.setQuestion(quest);
			return answerRepository.save(answer);
		}).orElseThrow(() -> new ResourceNotFoundException("questionId"+questionId+"not found"));		
	}
	public Optional<Answer> listAllByQuestionId(Integer questionId){
		return  answerRepository.findById(questionId);
	}
//	public Optional<Answer> listById(Integer id) {
//		return answerRepository.findById(id);
//	}
	public void delete(Integer id) {
		answerRepository.deleteById(id);
	}
	

}
