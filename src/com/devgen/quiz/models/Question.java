package com.devgen.quiz.models;

import java.util.Arrays;

public class Question {
	
    private int id;
    private String question;
    private String[] options;
    private String answer;

    public Question(int id, String question, String[] options,
            String answer) {
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

	public String getAnswer() {
        return answer;
    }
   

	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", options=" + Arrays.toString(options) + ", answer="
				+ answer + "]";
	}
  
    


}
