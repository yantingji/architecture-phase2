package juice;

public class Apple extends Water implements Filter, Huanchong, TraceElement, Applejuice{
	
	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.water();
		apple.Filter();
		apple.Huanchong();
		apple.TraceElement();
		apple.Juice();
		System.out.println("就是苹果juice啦")	;
		
	
	}
	

	
}
