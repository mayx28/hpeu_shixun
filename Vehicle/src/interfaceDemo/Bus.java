package interfaceDemo;

public class Bus implements Vehicle {
	int speed;

	public void start() {
		System.out.println("Bus is starting~~~~");

	}

	public void stop() {
		System.out.println("Bus is stoping~~~~");

	}

	public void speedUp(int speed) {
		this.speed = speed;
		System.out.println("Bus speedup:" + speed);
	}

	public int getSpeed() {
		System.out.println("Current Bus speed is:" + speed);
		return speed;
	}
}
