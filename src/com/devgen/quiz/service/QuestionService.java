package com.devgen.quiz.service;

import com.devgen.quiz.models.Question;

public class QuestionService {
    
    private Question[] questions;
    private int current;
    
    public QuestionService(int size) {
    	questions = new Question[size];     	
    	initializeDefaultQuestions();    	
    }

	private void initializeDefaultQuestions() {
		
		questions[current++] = new Question(1, "Size of short data type", new String[] {"2", "4", "1", "8"}, 1);
    	
    	questions[current++] = new Question(2, "Is Java Object Oriented Lang ?", new String[] {"true", "false"}, 1);
    	
    	questions[current++] = new Question(3, "Size of float data type", new String[] {"2", "4", "1", "8"}, 1);
    	
    	questions[current++] = new Question(4, "How do you create a variable with the numeric value 5?", new String[] {"int x=5;", "float f=4.5;", "num x=5", "x=5"}, 1);
    	    	
    	questions[current++] = new Question(5, "Size of char data type", new String[] {"2", "4"}, 1);
	}
	
    
    public void addQuestion(Question question) {
    	questions[current] = question;  
    	current++;
    	
    	System.out.println("Question added succesfully");
    }
    
    public void updateQuestion(Question modifiedQuestion) {
    	
    	//1. find the question for the given id.
    	
    	int id = modifiedQuestion.getId();
    	
    	for(int i = 0; i < questions.length; i++) {
    		if( id == questions[i].getId() ) {
    			questions[i] = modifiedQuestion;
    			break;
    		}
    	}    	
    	
    	System.out.println("Question updated succesfully");
    }
    
    public void deleteQuestion(int id) {
    	
    	for(int i = 0; i < questions.length; i++) {
    		if(questions[i] != null) {
	    		if( id == questions[i].getId() ) {
	    			questions[i] = null; // making eligible for garbage collector to be removed from heap memory in next cycle of run.
	    			
	    			//delete questions[i]; - C++
	    		}
    		}
    	}   
    	
    	
    	System.out.println("Question deleted succesfully");
    }
    
    public Question[] getAllQuestion() {
    	return questions;
    }
    
    public Question[] searchQuestions(String searchStr) {
    	
    	//TODO: Search the questions based on the given search string and return the matching questions to the user.
    	//i/p -> "data type"
    	
    	return null;
    }
    
   
}
