package che;

public abstract class Vehicle {
	 int speed;
	 int size;
	
    public Vehicle() {
		
	}
	
	public Vehicle(int speed,int size) {
	}
	
	public void move() {
	}
	
	public void setSpeed(int speed) {
	}
	
    public void speedUp() {
    	System.out.println("jia su");
    }
	
    public void speedDown() {
    	System.out.println("jian su");
    	
    }

	
}
