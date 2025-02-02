package com.devgen.quiz.client;

import com.devgen.quiz.models.Question;
import com.devgen.quiz.service.QuestionService;

public class QuestionServiceClient {

	public static void main(String[] args) {
		
		QuestionService questionService = new QuestionService(10);
		
		Question question1 = new Question(6, "Java Born year", new String[] {"1885", "1920", "1995", "2005"}, 3);		
		questionService.addQuestion(question1);
		
		Question question2 = new Question(7, "Which method can be used to return a string in upper case letters?", new String[] {"upc", "uppercase", "toUppercase", "toUpperCase"}, 4);		
		questionService.addQuestion(question2);
		
		Question question3 = new Question(8, "Array indexes start with:", new String[] {"0", "1"}, 1);		
		questionService.addQuestion(question3);
		
		Question question4 = new Question(9, "How do you call a method in Java?",new String[] { "methodName[]", "methodName()"}, 2);		
		questionService.addQuestion(question4);
		
		Question question5 = new Question(6, "Which method can be used to find the highest value of x and y?",new String[] { "Math.max(x,y)", "Math.maximum(x,y)"}, 1);		
		questionService.addQuestion(question5);
		
		
		Question[] questions = questionService.getAllQuestion();
		
		Question originalQuestion = questions[2];
		originalQuestion.setAnswer(2); //updated new answer
		originalQuestion.setQuestion("What is the size of float data type in java ?"); //updated new question
		
		
		questionService.updateQuestion(originalQuestion);
		
		
		questions = questionService.getAllQuestion();
		for(Question q : questions)
			System.out.println(q);
		
		
		
		
	}
}
