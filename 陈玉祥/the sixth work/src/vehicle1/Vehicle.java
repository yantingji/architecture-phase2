package vehicle1;

public interface Vehicle {
	public default void start() {
		System.out.println("开车了");
	}
	
	public default void stop() {
		System.out.println("停车了");
	}

	

}
