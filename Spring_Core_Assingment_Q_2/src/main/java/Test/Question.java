package Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question {

	int question_Id;
	String question;
	List<String> questionList;
	Set<String> questionSet;
	Map<Integer, String> questionMap;

	public Question(int question_Id, String question, List<String> questionList, Set<String> questionSet,
			Map<Integer, String> questionMap) {
		super();
		this.question_Id = question_Id;
		this.question = question;
		this.questionList = questionList;
		this.questionSet = questionSet;
		this.questionMap = questionMap;
	}

	public int getQuestionId() {
		return question_Id;
	}

	public String getQuestion() {
		return question;
	}

	public List<String> getQuestionList() {
		return questionList;
	}

	public Set<String> getQuestionSet() {
		return questionSet;
	}

	public Map<Integer, String> getQuestionMap() {
		return questionMap;
	}

}
