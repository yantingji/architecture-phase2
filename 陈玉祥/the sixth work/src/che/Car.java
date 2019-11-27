package che;

public class Car extends Vehicle {
	int size;
	int speed;
	
	public Car() {
		
	}
	
	public Car(int speed,int size) {
		this.size = size;
		this.speed = speed;
	}
	
	@Override
	public void speedUp() {
		System.out.println("jia su");
	}
	
	@Override
	public void speedDown() {
		System.out.println("jian su");
		
	}
	
	    
	
	
	

	

}
