package oop;
//定义一个交通工具(Vehicle)的类其中有: 属性速度(speed)体积(size)等等 
//方法移动(move())设置速度(setSpeed(int speed))加速speedUp(),减速speedDown()等等. 
//最后在测试类Vehicle中的main()中实例化一个交通工具对象并通过方法给它初始化speed,size的值并且通过打印出来。
//另外调用加速减速的方法对速度进行改变。
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