package Auto;
//�ٶ���һ��С������Car �̳�Auto ����ӿյ���CD�ȳ�Ա���� ���Ǽ��� ���ٵķ���
public class Car extends Auto {
	private String air;//�յ�
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
    }//����
	@Override
	public void SubSpeed(Integer speed) {
    	speed--;
    }//����
}
