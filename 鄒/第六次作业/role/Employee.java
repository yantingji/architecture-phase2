package role;
//2.��Role��������һ��"Employee"�� �������Role������г�Ա ���췽������ ����չ salary��Ա����
//ͬʱ����һ����̬��Ա������ְ����� ID ����
//ͬ��Ҫ�������������췽�� Ҫ���ֳ�this��super�ļ����÷� ��Ҫ�󸲸�play()���� ���ṩһ��final sing()������
public class Employee extends Role {
	public int salary;//��չ salary��Ա����
	public static int ID;//ְ����� ID
	@Override
	void play() {
		System.out.println("Employee play" + salary);		
	}
	public void setName() {
		System.out.println();		
	}
	public void creat1() {//���췽��1
		System.out.println();
	}
	public void creat2() {//���췽��2
		System.out.println();
	}
	public final void sing() {
		System.out.println();
	}
}