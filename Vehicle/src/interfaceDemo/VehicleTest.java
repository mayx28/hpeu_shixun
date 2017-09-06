package interfaceDemo;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Bus bus = new Bus();
		car.start();
		car.stop();
		car.speedUp(140);
		car.getSpeed();
		System.out.println("------------------");
		bus.start();
		bus.stop();
		bus.speedUp(100);
		bus.getSpeed();
	}

}
