package vehicle1;

public class Buss implements Vehicle {
	@Override
	public void start() {
		System.out.println("开车了");
	}
	
	@Override
	public void stop() {
		System.out.println("停车了");
	}

	
}
