package com.kk.OneToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Question")
public class Question {

	@Id
	@Column(name="Question_Id")
	private int quesId;
	
	@Column(name="Question")
	private String ques;
	
	@OneToMany(mappedBy="ques", fetch=FetchType.EAGER)
	private List<Answer> answer;

	public Question() {
		super();
	}

	public Question(int quesId, String ques, List<Answer> answer) {
		super();
		this.quesId = quesId;
		this.ques = ques;
		this.answer = answer;
	}

	public int getQuesId() {
		return quesId;
	}

	public void setQuesId(int quesId) {
		this.quesId = quesId;
	}

	public String getQues() {
		return ques;
	}

	public void setQues(String ques) {
		this.ques = ques;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [quesId=" + quesId + ", ques=" + ques + ", answer=" + answer + "]";
	}	
}
