package interfaceDemo;

public class Car implements Vehicle {
	int speed;

	public void start() {
		System.out.println("Car is starting~~~~");

	}

	public void stop() {
		System.out.println("Car is stoping~~~~");

	}

	public void speedUp(int speed) {
		this.speed = speed;
		System.out.println("Car speedup:" + speed);
	}

	public int getSpeed() {
		System.out.println("Current Car speed is:" + speed);
		return speed;
	}
}
