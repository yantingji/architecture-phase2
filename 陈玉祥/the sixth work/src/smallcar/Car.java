package smallcar;

public class Car extends Auto {
	int kongtiao;
	int CD;
	@Override
	public void speedUp() {
		System.out.println("打开空调");
	}
	@Override
	public void speedDown() {
		System.out.println("打开CD");
	}
	

}
