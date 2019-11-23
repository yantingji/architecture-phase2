package gouzaofangfa;

public class Number {
	private int n1;
	private int n2;
	
	public Number() {
		
	}
	
	public Number(int n1,int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public int addition() {
		return n1 + n2;
	}
	
	public int subtration() {
		return n1 - n2;
	}
	
	public int multiplication() {
		return n1 * n2;
	}
	
	public int division() {
		return n1 / n2;
	}
	
	public static void main(String[] args) {
		Number number = new Number(10,2);
		int result = number.addition();
		System.out.println("求和" + result);
		
		int result1 = number.subtration();
		System.out.println("求差" + result1);
		
		int result2 = number.multiplication();
		System.out.println("求积" + result2);
		
		int result3 = number.division();
		System.out.println("求商" + result3);
	}
	
}
