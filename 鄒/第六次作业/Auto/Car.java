package Auto;
//再定义一个小汽车类Car 继承Auto 并添加空调、CD等成员变量 覆盖加速 减速的方法
public class Car extends Auto {
	private String air;//空调
    private String cd;//CD
	public String getAir() {
		return air;
	}
	public void setAir(String air) {
		this.air = air;
	}
	public String getCd() {
		return cd;
	}
	public void setCd(String cd) {
		this.cd = cd;
	}
	@Override
	public void AddSpeed(Integer speed) {
    	speed++;
    }//加速
	@Override
	public void SubSpeed(Integer speed) {
    	speed--;
    }//减速
}
