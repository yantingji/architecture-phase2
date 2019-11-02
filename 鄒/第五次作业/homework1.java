package HelloWorld;

import java.util.Scanner;

public class homework1 {
	public static void main(String[] args) {
		System.out.println("请月份数：");
		  Scanner s = new Scanner(System.in);
		  int n = s.nextInt();
	
		  System.out.println("总数："+"\n"+f(n));
 
	}
	public static int f(int n) {
		if(n!=1&&n!=2) {
			if(n!=3) {
				return f(n-1)+f(n-3);
			}
			return 2;
		}
		else return 1;
	}
}