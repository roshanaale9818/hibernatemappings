package com.hibernatemappings.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="question")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	


	private String qname;
	
	//{"qname":"roshan khadka}
		
	@OneToMany(mappedBy = "question")
//	@JoinColumn(name="question_id",referencedColumnName = "id")
	private List<Answer> answers;


	public Question() {

	}




	public Question(int id, String qname, List<Answer> answers) {
		super();
		this.id = id;
		this.qname = qname;
		this.answers = answers;
	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getQname() {
		return qname;
	}


	public void setQname(String qname) {
		this.qname = qname;
	}


	public List<Answer> getAnswers() {
		return answers;
	}


	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	

}
