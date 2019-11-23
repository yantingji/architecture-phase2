package vehicle;
//创建一个名称为interfaceDemo的类 在interfaceDemo的main()方法中创建Bike和Bus对象,并访问start()和stop()方法。
public class InterfaceDemo {
     public static void main(String[] args) {
    	 Bike bike=new Bike();
    	 bike.start(20);
    	 bike.stop(0);
    	 Bus bus=new Bus();
    	 bus.start(30);
    	 bus.stop(0);
     }
}
