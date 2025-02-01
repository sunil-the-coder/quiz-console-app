package com.devgen.quiz.client;

import com.devgen.quiz.service.QuestionService;
import com.devgen.quiz.service.QuizService;

public class QuizAppClient {
    
    public static void main(String[] args) {
        
    	QuestionService questionService = new QuestionService(10);
    	QuizService quizService = new QuizService(questionService);
    	quizService.playQuiz();
    	quizService.printFinalScore();
    	
    
    }
}

