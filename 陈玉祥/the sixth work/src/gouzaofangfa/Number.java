package gouzaofangfa;

public class Number {
	private static int n1;
	private static int n2;
	
	public Number(int n1,int n2) {
	}

	public int addition(int n1,int n2) {
		return n1 + n2;
	}
	
	public int subtration(int n1,int n2) {
		return n1 - n2;
	}
	
	public int multiplication(int n1,int n2) {
		return n1 * n2;
	}
	
	public int division(int n1,int n2) {
		return n1 / n2;
	}
	
	public static void main(String[] args) {
		Number number = new Number(n1,n2);
		int n1 = 10;
		int n2 = 2;
		int result =  number.addition(n1,n2);
		System.out.println("求和" + result);
		
		int result1 = number.subtration(n1, n2);
		System.out.println("求差" + result1);
		
		int result2 = number.multiplication(n1, n2);
		System.out.println("求积" + result2);
		
		int result3 = number.division(n1, n2);
		System.out.println("求商" + result3);
	}
	
}
