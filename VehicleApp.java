package com.codegnan.interfaces;

public class VehicleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Slavia();
//	    Fortuner c1 = new Fortuner();
//		Slavia c1 = new Slavia();
		c1.accelerate(15);
		c1.accelerate(40);
		c1.accelerate(70);
		c1.accelerate(30);
		c1.accelerate(20);
		c1.turnDirection("left");
		c1.accelerate(45);
		c1.accelerate(75);
		c1.accelerate(50);
		c1.accelerate(30);
		c1.accelerate(15);
		c1.turnDirection("Right");
		c1.stop();
//		c1.fourWheel();
//		c1.sunRoof();
	}

}
