package com.AbstractVehicle.java;

public class Bus extends AbstractVehicle {
	int speed;

	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
	}

	public void stop() {
		System.out.println("Bus is stoping");
	}

	public void speedUp(int speed) {
		this.speed = speed;
		System.out.println("Bus speedup:" + speed);
	}

	public int getSpeed() {
		System.out.println("Current bus speed:" + speed);
		return speed;
	}
}
