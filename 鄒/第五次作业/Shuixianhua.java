package HelloWorld;
//题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
//例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。1*1*1+5*5*5+3*3*3=153
public class Shuixianhua {
	public static void main(String[] args) {    
	    for(int i = 100;i < 999;i++ ){
	    	int a = i / 100,b = i / 10 % 10,c = i % 10;//a为百位，b为十位，c为个位。
	        if(i == a*a*a+b*b*b+c*c*c) {
	        	System.out.println(i);
	        } 	
	    }
	}
}
