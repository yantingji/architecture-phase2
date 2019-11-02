import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ball {

	public static void main(String[] args) {
	float heigh = 100, cishu = 10, sum = heigh;
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 1; i < cishu; i++) {
    	heigh = heigh / 2;
    	sum = sum + heigh * 2;
    }
    System.out.println("10次" + sum);
    System.out.println("10次" + "" + heigh / 2);
    	
    }

}
