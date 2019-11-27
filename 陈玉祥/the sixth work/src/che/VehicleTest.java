package che;

public class VehicleTest {

	public static void main(String[] args) {
		Car car = new Car(100,10);
		int size = car.size;
		int speed = car.speed;
		System.out.println("体积:" + size + "速度	:" + speed);
	
		car.speedUp();
		car.speedDown();
	}

}
