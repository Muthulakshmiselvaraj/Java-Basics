import java.util.*;

class Mul{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		for(int i=1;i<=10;i++){
			int ans = i*n;
			System.out.println(i+"*"+n+"="+ans);
		}
	}
}