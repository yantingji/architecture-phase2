
public class sushu {

	public static void main(String[] args) {
		int i, j, n, m, x;       //n是用来存储余数的；m是用来统计具体一个数的因子；
		n = 0; m = 0; x = 0;     //x是用来统计1~200之间素数的个数	
		for(i = 1; i <= 200; i++) {
			for(j = 1; j <= i; j++) {
				n = i % j;
				if(n == 0) {
					m = m + 1;
				}
			}
			if(m == 2) {
				System.out.print(i + ""); x = x + 1;
			}
			m = 0;
		}
		System.out.println();
		System.out.println("在1~200之间一共有素数:" + x + "个");

	}

}
