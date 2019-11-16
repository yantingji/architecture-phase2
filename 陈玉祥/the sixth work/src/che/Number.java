package che;

public class Number {

	private Integer n1;
	private Integer n2;
	
	public Number() {
	}
	
	public Number(Integer n1,Integer n2) {
		this.n1=n1;
		this.n2=n2;
	}
	
	public Integer addition() {
		return n1+n2;
	}
	public Integer subtration() {
		return n1-n2;
	}
	public Integer multiplication() {
		return n1*n2;
	}
	public Integer division() {
		return n1/n2;
	}
	
	public static void main(String args[]) {
		Number number1 = new Number();
		Number number = new Number(1,2);
		System.out.println(number.addition());
		System.out.println(number.subtration());
		System.out.println(number.multiplication());
		System.out.println(number.division());
	}
}
