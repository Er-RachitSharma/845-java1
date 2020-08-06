package com.lti.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestionBank {
	
	//Subject wise list of questions
	private Map<String, List<Question>> questionBank = new HashMap<>();
	
//	-- Poor approach --
//	private List<Question> questionsOnJava;
//	private List<Question> questionsOnDotNet;
//	private List<Question> questionsOnPython;
//	private List<Question> questionsOnAngular;
	
	public void addNewSubject(String subjectName) {
		questionBank.put(subjectName, new ArrayList<>());
	}
	
	public void addNewQuestion(String subjectName, Question question) {
		List<Question> questions = questionBank.get(subjectName);
		questions.add(question);
	}
	
	public List<Question> getQuestionsFor(String subjectName){
		return questionBank.get(subjectName);
	}
	
}
