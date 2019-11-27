package Role;

public class Employee extends Role {
	private int name;
	private int age;
	private int sex;
	private int salary;
	static int id;
	
	public Employee() {
		
	}
	
	public int getName() {
		return name;
	}
	
	public void getName(int name) {
		this.name = name;
	}
	
	public Employee(int name,int age, int sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	public Employee(int name,int age) {
		super(name, age);
	}
	
	public Employee(int name, int age, int sex, int salary) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.salary = salary;
	}
	
	@Override
	public void play() {
		
	}
	
	final void sing() {
		
	}
	
	
}
