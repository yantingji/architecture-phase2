package oop;
//编写Java程序模拟简单的计算器。 定义名为Number的类其中有两个整型数据成员n1和n2应声明为私有。
//编写构造方法赋予n1和n2初始值再为该类定义加addition、减subtration、乘multiplication、
//除division等公有成员方法分别对两个成员变量执行加、减、乘、除的运算。 
//在main方法中创建Number类的对象调用各个方法并显示计算结果。

public class Number {
	private Integer n1;
	private Integer n2;
	public Number() {		
	} 
    public Number(Integer n1,Integer n2) {
    	this.n1 = n1;
    	this.n2 = n2;
    }
    public Integer addition() {
    	return n1 + n2;
    }
    public Integer subtration() {
    	return n1 - n2;
    }
    public Integer multiplication() {
    	return n1 * n2;
    }
    public Integer division() {
    	return n1 / n2;
    }
    public static void main(String[]args) {
    	Number number = new Number(8,4);
    	System.out.println(number.addition());
    	System.out.println(number.subtration());
    	System.out.println(number.multiplication());
    	System.out.println(number.division());
    }
}