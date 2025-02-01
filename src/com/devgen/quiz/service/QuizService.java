package com.devgen.quiz.service;

import java.util.Scanner;

import com.devgen.quiz.models.Question;

public class QuizService {

    private String[] userSelectedAnswers = new String[5];
	private Question[] questions;	
	
	public QuizService() {
		QuestionService questionService = new QuestionService();    
		questions = questionService.getAllQuestion();
	}

	public void playQuiz() {
	
    	Scanner scan = new Scanner(System.in);
    	
    	 for(int i = 0; i < questions.length; i++) {
             
         	System.out.println("Question: "+questions[i].getId());
         	System.out.println(questions[i].getQuestion());
         	
         	System.out.println(questions[i].getOption1());
         	System.out.println(questions[i].getOption2());
         	System.out.println(questions[i].getOption3());
         	System.out.println(questions[i].getOption4());         
         	
         	userSelectedAnswers[i] = scan.next();
         	         	         		
         }
    	 
    	 scan.close();
    }
    
    public void printFinalScore() {
    	
    	int correctAnswers = 0;
    	for(int i = 0; i < userSelectedAnswers.length; i++) {
    		if(questions[i].getAnswer().equals(userSelectedAnswers[i])) {
    			correctAnswers++;
    		}
    	}
    	
    	int incorrectAnswers = questions.length - correctAnswers;
    	
    	//( 2 / 5) * 100
    	double percentage = ((double) correctAnswers / questions.length)  * 100;
    	
    	System.out.println("Correct Answers:"+correctAnswers);
    	System.out.println("Incorrect Answers:"+incorrectAnswers);
    	System.out.println("Percentage:"+percentage);
    	
    }
}
