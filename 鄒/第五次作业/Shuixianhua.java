package HelloWorld;
//��Ŀ����ӡ�����е� "ˮ�ɻ��� "����ν "ˮ�ɻ��� "��ָһ����λ�������λ���������͵��ڸ�������
//���磺153��һ�� "ˮ�ɻ��� "����Ϊ153=1�����η���5�����η���3�����η���1*1*1+5*5*5+3*3*3=153
public class Shuixianhua {
	public static void main(String[] args) {    
	    for(int i = 100;i < 999;i++ ){
	    	int a = i / 100,b = i / 10 % 10,c = i % 10;//aΪ��λ��bΪʮλ��cΪ��λ��
	        if(i == a*a*a+b*b*b+c*c*c) {
	        	System.out.println(i);
	        } 	
	    }
	}
}
