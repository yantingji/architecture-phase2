package vehicle;
//����һ������ΪinterfaceDemo���� ��interfaceDemo��main()�����д���Bike��Bus����,������start()��stop()������
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
