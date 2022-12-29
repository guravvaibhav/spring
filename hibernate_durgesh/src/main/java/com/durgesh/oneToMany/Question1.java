package com.durgesh.oneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity()
public class Question1 {
	@Id
	private int q_id;
	private String question;								// cascad to change according to questio in answer
	@OneToMany(mappedBy = "question",fetch = FetchType.LAZY,cascade = CascadeType.ALL) // you can set lazy/egar loading
	private List<Answer1> Answers;							  // by default lazy loading

	public Question1() {
		super();
	}

	public Question1(int q_id, String question, List<Answer1> Answers) {
		super();
		this.q_id = q_id;
		this.question = question;
		this.Answers = Answers;
	}

	public int getQ_id() {
		return q_id;
	}

	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer1> getAnswers() {
		return Answers;
	}

	public void setAnswers(List<Answer1> Answers) {
		this.Answers = Answers;
	}

	@Override
	public String toString() {
		return "Question1 [q_id=" + q_id + ", question=" + question + ", Answers=" + Answers + "]";
	}
	
	
}
