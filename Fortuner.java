package com.codegnan.interfaces;

public class Fortuner implements Car{

	@Override
	public void accelerate(int points) {
		// TODO Auto-generated method stub
		if(points <=100 && points >=10) {
			System.out.println("Fortuner speed is: "+points);
		}
	}

	@Override
	public void turnDirection(String dir) {
		// TODO Auto-generated method stub
		if(dir.equalsIgnoreCase("left")) {
			System.out.println("Fortuner is turning left");
		}if(dir.equalsIgnoreCase("right")) {
			System.out.println("Fortuner is turning right");
		}
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Fortunre has stopped");
	}

	public void fourWheel() {
		System.out.println("Fortuner engagged with four wheels");
	}
}
