package com.durgesh.oneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Answer1 {
	@Id
	private int ans_id;
	private String Answer;
	@ManyToOne
	private Question1 question;
	public Answer1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer1(int ans_id, String Answer, Question1 question) {
		super();
		this.ans_id = ans_id;
		this.Answer = Answer;
		this.question = question;
	}
	public int getAns_id() {
		return ans_id;
	}
	public void setAns_id(int ans_id) {
		this.ans_id = ans_id;
	}
	public String getAnswer() {
		return Answer;
	}
	public void setAnswer1(String Answer) {
		this.Answer = Answer;
	}
	public Question1 getQuestion() {
		return question;
	}
	public void setQuestion(Question1 question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "Answer1 [ans_id=" + ans_id + ", Answer=" + Answer + ", question=" + question + "]";
	}
	
	
}
