package com.devgen.quiz.models;

import java.util.Arrays;

public class Question {
	
    private int id;
    private String question;
    private String[] options;
    private int answer;

    public Question(int id, String question, String[] options,
            int answer) {
        this.id = id;
        this.question = question;
        this.options = options;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }
   
 
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
   
    
    public String[] getOptions() {
		return options;
	}

	public int getAnswer() {
        return answer;
    }
	
	public void setAnswer(int answer) {
		this.answer = answer;
	}
   

	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", options=" + Arrays.toString(options) + ", answer="
				+ answer + "]";
	}
  
    


}
