
public class rabit {

	public static void main(String[] args) {
		int i;
		long arr[] = new long[31];
		arr[0]=arr[1]=1;
		System.out.println("第1个月有兔子1对" + "," + "总数是" + 2);
		System.out.println("第2个月有兔子1对" + "," + "总数是" + 2);
		for(i = 2; i <= 30; i++) {
			arr[i] = arr[i-1] + arr[i-2];
			System.out.println("第" + i + "个月有兔子" + arr[i] + "对" + "," + "总数是" + 2*arr[i]);
			
		}
		
		
		
		
	}

}
		