package com.AbstractVehicle.java;

public class Car extends AbstractVehicle {
	int speed;

	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
	}

	public void stop() {
		System.out.println("Car is stoping");
	}

	public void speedUp(int speed) {
		this.speed = speed;
		System.out.println("Car speedup:" + speed);
	}

	public int getSpeed() {
		System.out.println("Current Car speed:" + speed);
		return speed;
	}
}
