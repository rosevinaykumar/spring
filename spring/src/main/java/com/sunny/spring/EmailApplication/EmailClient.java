package com.sunny.spring.EmailApplication;

public class EmailClient {
	// 
	private BasicSpellChecker  basicSpellChecker;
	private AdvSpellChecker advSpellChecker;
	
	// Constructor
	public EmailClient() {
		this.basicSpellChecker = new BasicSpellChecker();
		this.advSpellChecker = new AdvSpellChecker();
	}
	
	public void sendEmail(String message) {
		advSpellChecker.checkSpelling(message);
	}

}
