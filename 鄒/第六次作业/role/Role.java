package role;
//����һ�������"Role"�� ������ ���� �Ա�ȳ�Ա����
//1. Ҫ�󾡿����������б���(�ܹ�˽�о�˽��,�ܹ������Ͳ�Ҫ����) ��ͨ��GetXXX()��SetXXX()�����Ը��������ж�д��
//����һ�������play()���� �÷����������κ�ֵ ͬʱ���ٶ����������췽����Role����Ҫ���ֳ�this�ļ����÷��� 
//2. ��Role��������һ��"Employee"�� �������Role������г�Ա ���췽������ ����չ salary��Ա����
//ͬʱ����һ����̬��Ա������ְ����� ID ����
//ͬ��Ҫ�������������췽�� Ҫ���ֳ�this��super�ļ����÷� ��Ҫ�󸲸�play()���� ���ṩһ��final sing()������ 
//3. "Manager"��̳�"Employee"�� ��һ��final��Ա����"vehicle" 
//4. ��main()����������Manager��Employee����,��������Щ����ķ���
abstract class Role {
    private String name;//����
    private Integer age;//����
    private String gender;//�Ա�
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private Integer getAge() {
		return age;
	}
	private void setAge(Integer age) {
		this.age = age;
	}
	private String getGender() {
		return gender;
	}
	private void setGender(String gender) {
		this.gender = gender;
	}
	abstract void play();//�����play()����,�÷����������κ�ֵ
	private void creat1() {//���췽��1
		this.age = new Integer(16);
	}
	private void creat2() {//���췽��2
		this.name = new String();
	}
}
