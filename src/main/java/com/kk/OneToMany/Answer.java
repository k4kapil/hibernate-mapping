package com.kk.OneToMany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Answer")
public class Answer {

	@Id
	@Column(name="Anwer_Id")
	private int ansId;
	
	@Column(name="Answer")
	private String answer;
	
	@ManyToOne(cascade= CascadeType.ALL)
	private Question ques;

	public Answer() {
		super();
	}

	public Answer(int ansId, String answer, Question ques) {
		super();
		this.ansId = ansId;
		this.answer = answer;
		this.ques = ques;
	}

	public int getAnsId() {
		return ansId;
	}

	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question getQues() {
		return ques;
	}

	public void setQues(Question ques) {
		this.ques = ques;
	}

	@Override
	public String toString() {
		return "Answer [ansId=" + ansId + ", answer=" + answer + ", ques=" + ques + "]";
	}
		
}
