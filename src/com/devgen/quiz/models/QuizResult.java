package com.devgen.quiz.models;

public class QuizResult {

	private int correctAnswers;
	private int incorrectAnswers;
	private double percentage;
	private String suggestion;
	
	public QuizResult(int correctAnswers, int incorrectAnswers, double percentage, String suggestion) {
		this.correctAnswers = correctAnswers;
		this.incorrectAnswers = incorrectAnswers;
		this.percentage = percentage;
		this.suggestion = suggestion;
	}
	
	public int getCorrectAnswers() {
		return correctAnswers;
	}
	public int getIncorrectAnswers() {
		return incorrectAnswers;
	}
	public double getPercentage() {
		return percentage;
	}
	public String getSuggestion() {
		return suggestion;
	}
	
	
}
