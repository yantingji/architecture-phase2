package smallcar;

public class Car extends Auto {
	int kongtiao;
	int CD;
	@Override
	public void speedUp() {
		System.out.println("jiasu");
	}
	@Override
	public void speedDown() {
		System.out.println("jiansu");
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.speedDown();
		car.speedUp();
	}
	

}
