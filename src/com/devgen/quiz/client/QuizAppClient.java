package com.devgen.quiz.client;

import com.devgen.quiz.service.QuizService;

public class QuizAppClient {
    
    public static void main(String[] args) {
        
    	QuizService quizService = new QuizService();
    	quizService.playQuiz();
    	quizService.printFinalScore();
    }
}
