package com.AbstractVehicle.java;

public abstract class AbstractVehicle {
	public void start() {
		System.out.println("Vehicle is start~~~~");
	}

	public abstract void stop();

	public abstract void speedUp(int speed);

	public abstract int getSpeed();
}
