package com.devgen.quiz.service;

import com.devgen.quiz.models.Question;

public class QuestionService {
    
    private Question[] questions;// = new Question[10]; 
   
    private int current;
    
    //[100, 200, 300, 400, 500]

    public QuestionService(int size) {
    	
    	questions = new Question[size]; 
    	
    	questions[current] = new Question(1, "Size of short data type", new String[] {"2", "4", "1", "8"}, 1);
    	current++;
    	
    	questions[current] = new Question(2, "Is Java Object Oriented Lang ?", new String[] {"true", "false"}, 1);
    	current++;
    	
    	questions[current] = new Question(3, "Size of float data type", new String[] {"2", "4", "1", "8"}, 2);
    	current++;
    	
    	questions[current] = new Question(4, "How do you create a variable with the numeric value 5?", new String[] {"int x=5;", "float f=4.5;", "num x=5", "x=5"}, 1);
    	current++;
    	
    	questions[current] = new Question(5, "Size of char data type", new String[] {"2", "4"}, 1);
    	current++;

    }
    
    // Question question
    public String addQuestion(Question question) {
    //	int length = questions.length;    	// length is total no of elements - 5 
    	questions[current] = question;  // 5 = 6  questions[5] = question;
    	current++;
    	
    	return "Question added succesfully";
    }
    
    public String updateQuestion(Question question) {
    	return "Question updated succesfully";
    }
    
    public String deleteQuestion(int id) {
    	return "Question deleted succesfully";
    }
    
    public Question[] getAllQuestion() {
    	return questions;
    }
    
   
}
