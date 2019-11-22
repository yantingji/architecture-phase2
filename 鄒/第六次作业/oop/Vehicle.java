package oop;
//����һ����ͨ����(Vehicle)����������: �����ٶ�(speed)���(size)�ȵ� 
//�����ƶ�(move())�����ٶ�(setSpeed(int speed))����speedUp(),����speedDown()�ȵ�. 
//����ڲ�����Vehicle�е�main()��ʵ����һ����ͨ���߶���ͨ������������ʼ��speed,size��ֵ����ͨ����ӡ������
//������ü��ټ��ٵķ������ٶȽ��иı䡣
public class Vehicle{
    private int speed;
    private int size;
    public Vehicle(){
        speed=0;
        size=0;
    }
    public Vehicle(int speed,int size){
        this.speed=speed;
        this.size=size;
    }
    public void move(){
    }
    public void setSpeed(int speed){
        this.speed=speed;
    }
    public void setSize(int size){
        this.size=size;
    }
    public void speedUp(){
        speed++;
    }
    public void speedUp(int n){
        speed+=n;
    }
    public void speedDown(){
        speed--;
    }
    public void speedDown(int n){
        speed-=n;
    }
    public String toString(){
        return "speed:"+speed+",size:"+size;
    }
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.setSpeed(2);
        v.setSize(1);
        System.out.println(v);
        v.speedUp();
        System.out.println(v);
        v.speedUp(3);
        System.out.println(v);
        v.speedDown();
        System.out.println(v);
        v.speedDown(2);
        System.out.println(v);
    }
}