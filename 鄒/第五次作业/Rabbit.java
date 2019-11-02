package HelloWorld;
import java.util.Scanner;
//题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第30个月的兔子总数为多少？   
//兔子数目序列： 1 1 2 3 5 8 .。。。。。。。。。总结出规律：前两项之和就是第三项，第n个月的兔子数目为：f(n)=f(n-1)+f(n-2)
public class Rabbit {
	public static void main(String[] args) {
	    System.out.println("请月份数：");
		    Scanner s = new Scanner(System.in);
		    int n = s.nextInt();	
		    s.close();
		    System.out.println("总数："+"\n"+getRabbitResult(n));
	}
	public static int getRabbitResult(int month) {//递归法
		if(month!=1&&month!=2) {
			if(month!=3) {
				return getRabbitResult(month-1)+getRabbitResult(month-3);
			}
			return 2;
		}
		else { 
			return 1;
			}
	}
}