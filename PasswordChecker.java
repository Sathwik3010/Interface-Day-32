package com.codegnan.interfaces;

public interface PasswordChecker {
	public void checkLength(String password);
	public String checkComplexity(String password);
	
}
