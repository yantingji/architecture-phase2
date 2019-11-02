
public class headfoot {

	public static void main(String[] args) {
		int x, y, z, sumhead, sumfoot;   //x九头鸟   y 凤凰   z 狮子
		for(x = 1; x <= 100; x++) {
			for(y = 1; y <=100; y++) {
				for(z = 1; z <= 100; z++) {
					sumhead = 9 * x + y + z;
					sumfoot  = 2 * x + 2 * y + 4 * z;
					if(sumhead == 100 && sumfoot == 100) {
						System.out.print(x + "" + y + "" + z + "");
				}
			}
		}
		
		}

	}
}
