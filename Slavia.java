package com.codegnan.interfaces;

public class Slavia implements Car{
	@Override
	public void accelerate(int points) {
		// TODO Auto-generated method stub
		if(points <=100 && points >=10) {
			System.out.println("Slavia speed is: "+points);
		}
	}

	@Override
	public void turnDirection(String dir) {
		// TODO Auto-generated method stub
		if(dir.equalsIgnoreCase("left")) {
			System.out.println("Slavia is turning left");
		}if(dir.equalsIgnoreCase("right")) {
			System.out.println("Slavia is turning right");
		}
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Slavia has stopped");
	}

	
	public void sunRoof() {
		System.out.println("SunRoof is opened");
	}
}
