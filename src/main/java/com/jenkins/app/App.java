package com.jenkins.app;

/**
 * Hello India, This is <Year>!
 */
public class App {

	private final String message = "Hello India, This is 2022!";

	public App() {
	}

	public static void main(String[] args) {
		System.out.println(new App().getMessage());
	}

	private final String getMessage() {
		return message;
	}

}
