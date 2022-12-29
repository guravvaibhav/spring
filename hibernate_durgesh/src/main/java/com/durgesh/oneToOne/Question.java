package com.durgesh.oneToOne;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	private int q_id;
	private String Question;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ans_id")
	private Answer answer;
	public Question() {
		super();
	}
	public Question(int q_id, String question, Answer answer) {
		super();
		this.q_id = q_id;
		Question = question;
		this.answer = answer;
	}
	public int getQ_id() {
		return q_id;
	}
	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}
	public String getQuestion() {
		return Question;
	}
	public void setQuestion(String question) {
		Question = question;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	
}
