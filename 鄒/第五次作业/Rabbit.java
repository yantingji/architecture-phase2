package HelloWorld;
import java.util.Scanner;
//��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ��������ʵ�30���µ���������Ϊ���٣�   
//������Ŀ���У� 1 1 2 3 5 8 .�������������������ܽ�����ɣ�ǰ����֮�;��ǵ������n���µ�������ĿΪ��f(n)=f(n-1)+f(n-2)
public class Rabbit {
	public static void main(String[] args) {
	    System.out.println("���·�����");
		    Scanner s = new Scanner(System.in);
		    int n = s.nextInt();	
		    s.close();
		    System.out.println("������"+"\n"+getRabbitResult(n));
	}
	public static int getRabbitResult(int month) {//�ݹ鷨
		if(month!=1&&month!=2) {
			if(month!=3) {
				return getRabbitResult(month-1)+getRabbitResult(month-3);
			}
			return 2;
		}
		else { 
			return 1;
			}
	}
}