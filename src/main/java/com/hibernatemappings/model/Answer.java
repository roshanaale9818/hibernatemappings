package com.hibernatemappings.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="answer")
public class Answer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String answername;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "question_id")
	private Question question;
	
	
	

public Answer(int id, String answername, Question question) {
		super();
		this.id = id;
		this.answername = answername;
		this.question = question;
	}



//	public Answer() {
//
//	}
//	
//	public Answer(String answername, Question questionId) {
//		super();
//		this.answername = answername;
//
//	}







	



	public int getId() {
	return id;
}



public void setId(int id) {
	this.id = id;
}



	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public String getAnswername() {
		return answername;
	}

	public void setAnswername(String answername) {
		this.answername = answername;
	}


	
	

}
