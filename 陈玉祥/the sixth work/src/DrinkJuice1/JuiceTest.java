package DrinkJuice1;

public class JuiceTest implements Juice {
	private AppleJuice applejuice;
	private OrangeJuice orangejuice;
	private int i;
	
	@Override
	public void flowout() {
		 applejuice = new AppleJuice();
		 applejuice.flowout();
		 
		 orangejuice = new OrangeJuice();
		 orangejuice.flowout();
	}
	
	public static void main(String[] args) {
		
	}
	

}
