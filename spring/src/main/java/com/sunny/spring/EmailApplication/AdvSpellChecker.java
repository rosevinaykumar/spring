package com.sunny.spring.EmailApplication;

public class AdvSpellChecker {
	public void checkSpelling(String message) {
		System.out.println(message!=null);
		if((message != null) || (message != "")) {
			System.out.println(message);
		} else {
			throw new RuntimeException("Error");
		}
	}
}
