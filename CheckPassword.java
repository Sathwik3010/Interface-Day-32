package com.codegnan.interfaces;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String password = sc.next();
		PasswordChecker checker = new SimplePasswordChecker();
		checker.checkLength(password);
		System.out.println(checker.checkComplexity(password));

		sc.close();
	}

}
