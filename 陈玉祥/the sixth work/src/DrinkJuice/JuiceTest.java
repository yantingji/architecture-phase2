package DrinkJuice;

public class JuiceTest implements Juice {
	static int i;

	public static void main(String[] args) {
		
		if(i == 1) {
			System.out.println(new OrangeJuice() {
				@Override
				public void flowout() {
					System.out.println("橘子汁");
				}
			});
		}
			else if(i == 2) {
				System.out.println(new AppleJuice() {
					@Override
				public void flowout() {
					System.out.println("苹果汁");
				}
				});
			}
			else {
				System.out.println("DrinkNotFoundException");
			
		}
	}

}
