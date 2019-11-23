package role;
//2.从Role类派生出一个"Employee"类 该类具有Role类的所有成员 构造方法除外 并扩展 salary成员变量
//同时增加一个静态成员变量“职工编号 ID ”。
//同样要有至少两个构造方法 要体现出this和super的几种用法 还要求覆盖play()方法 并提供一个final sing()方法。
public class Employee extends Role {
	public int salary;//扩展 salary成员变量
	public static int ID;//职工编号 ID
	@Override
	void play() {
		System.out.println("Employee play" + salary);		
	}
	public void setName() {
		System.out.println();		
	}
	public void creat1() {//构造方法1
		System.out.println();
	}
	public void creat2() {//构造方法2
		System.out.println();
	}
	public final void sing() {
		System.out.println();
	}
}