package Auto;
//����һ������Auto�� ������̥���� ������ɫ �����������ٶȵȳ�Ա������
//��ͨ����ͬ�Ĺ��췽������ʵ��������Ҫ�� �����ܹ����� ���� ͣ����
//�ٶ���һ��С������Car �̳�Auto ����ӿյ���CD�ȳ�Ա���� ���Ǽ��� ���ٵķ���
public class Auto {
    private Integer number;//��̥����
    private String color;//������ɫ
    private Integer weight;//��������
    private Integer speed;//�ٶ�
    public void Car(Integer number,String color,Integer weight,Integer speed) {
    	this.number = number;
    	this.color = color;
    	this.weight = weight;
    	this.speed = speed;
    }
    public void AddSpeed(Integer speed) {
    	speed++;
    }//����
    public void SubSpeed(Integer speed) {
    	speed--;
    }//����
    public void StopSpeed(Integer speed) {
    	speed = 0 ;
    }//ͣ��
    public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
}