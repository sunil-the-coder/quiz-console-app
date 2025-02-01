package com.devgen.quiz.client;

import com.devgen.quiz.service.QuestionService;

public class QuizAppClient {
    
    public static void main(String[] args) {
        
        QuestionService questionService = new QuestionService();
        questionService.playQuiz();
        questionService.printFinalScore();
    }
}
