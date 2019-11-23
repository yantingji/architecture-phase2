package Auto;
//建立一个汽车Auto类 包括轮胎个数 汽车颜色 车身重量、速度等成员变量。
//并通过不同的构造方法创建实例。至少要求 汽车能够加速 减速 停车。
//再定义一个小汽车类Car 继承Auto 并添加空调、CD等成员变量 覆盖加速 减速的方法
public class Auto {
    private Integer number;//轮胎个数
    private String color;//汽车颜色
    private Integer weight;//车身重量
    private Integer speed;//速度
    public void Car(Integer number,String color,Integer weight,Integer speed) {
    	this.number = number;
    	this.color = color;
    	this.weight = weight;
    	this.speed = speed;
    }
    public void AddSpeed(Integer speed) {
    	speed++;
    }//加速
    public void SubSpeed(Integer speed) {
    	speed--;
    }//减速
    public void StopSpeed(Integer speed) {
    	speed = 0 ;
    }//停车
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