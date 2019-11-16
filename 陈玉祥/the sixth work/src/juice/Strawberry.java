package juice;

public class Strawberry extends Water implements Filter, Huanchong, TraceElement, Strawberryjuice {
	
	public static void main(String[] args) {
		Strawberry strawberry = new Strawberry();
		strawberry.water();
		strawberry.Filter();
		strawberry.Huanchong();
		strawberry.TraceElement();
		strawberry.Juice();
		System.out.println("就是草莓汁啦");
	}

	

}
