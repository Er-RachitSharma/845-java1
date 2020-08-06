package com.lti.model;

import java.util.ArrayList;
import java.util.List;

import com.lti.model.Question.Difficulty;

public class QuestionBankLoader {
	
	public List<Question> loadQuestionsOnJava() {
		String subjectName = "Java";
		
		QuestionBank qb = new QuestionBank();
		qb.addNewSubject(subjectName);
		
		Question q = new Question("What is Java?", Difficulty.EASY);
		List<Option> ops = new ArrayList<Option>();
		ops.add(new Option("Java is a database", false));
		ops.add(new Option("Java is a programming language", true));
		ops.add(new Option("Java is an OS", false));
		ops.add(new Option("Java is a filesystem", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("What is G1?", Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("G1 is Garbage Collector in Java", true));
		ops.add(new Option("G1 is English word for Jeevan", false));
		ops.add(new Option("G1 is the name of a spy agency", false));
		ops.add(new Option("G1 is the sequal of SRK's Ra.One", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("Which is correct?", Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("int A = '1';", false));
		ops.add(new Option("string str = Rachit;", false));
		ops.add(new Option("int A = 1;", true));
		ops.add(new Option("boolean var = True;", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("Which is a permeative datatype?", Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("Integer", false));
		ops.add(new Option("String", false));
		ops.add(new Option("Character", false));
		ops.add(new Option("char", true));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		q = new Question("Abstract classes can not have _________?", Difficulty.EASY);
		ops = new ArrayList<Option>();
		ops.add(new Option("Objects", true));
		ops.add(new Option("Constructors", false));
		ops.add(new Option("Variables", false));
		ops.add(new Option("Methods", false));
		q.setOptions(ops);
		qb.addNewQuestion(subjectName, q);
		
		return qb.getQuestionsFor(subjectName);
	}
}
