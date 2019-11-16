package juice;

public interface Applejuice extends Juice {
	@Override
	public default void Juice() {
		System.out.println("加入苹果汁");
	}

	
}
