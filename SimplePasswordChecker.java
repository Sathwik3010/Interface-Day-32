package com.codegnan.interfaces;

public class SimplePasswordChecker implements PasswordChecker{

	@Override
	public void checkLength(String password) {
		// TODO Auto-generated method stub
		System.out.println("Length: "+password.length());
	}

	@Override
	public String checkComplexity(String password) {
		// TODO Auto-generated method stub
		int len = password.length();
		if(len<8)
			return "Weak";
		else if (len == 8)
			return "Medium";
		else
			return "Strong";
	}

}
