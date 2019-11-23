package role;
//4. 在main()方法中制造Manager和Employee对象,并测试这些对象的方法
public class Test {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.salary = 100;
		Employee.ID = 5789;
		employee.creat1();
		employee.creat2();
		employee.play();
		employee.setName();
		employee.sing();
		Manager manager = new Manager();
		manager.vehicle();
		manager.salary = 99;
		Employee.ID = 9988;
		manager.creat1();
		manager.creat2();
		manager.play();
		manager.setName();
		manager.sing();
		System.out.println(manager.salary);
	}
}
