package juice;

public interface Filter {
	public default void Filter() {
		System.out.println("过滤");
	}

	
}
