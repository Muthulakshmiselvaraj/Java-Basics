import java.util.*;

class Avg{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int sum=0,avg=0;
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		System.out.println("Enter the "+n+"Numbers:");
		for(int i=0;i<n;i++){
			int a = sc.nextInt();
			sum += a;
		}
		
		 avg = sum/n;
		 System.out.println(avg);
	}
}
