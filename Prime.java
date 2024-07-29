import java.util.*;
import java.io.*;
import java .lang.*;
class Prime{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = sc.nextInt();
		System.out.println(primeNumber(a));
	}
	public static boolean primeNumber(int num){
		
			for(int i=2;i<=Math.sqrt(num);i++){
				if (num%i==0){
					return false;
				}
			}
			return true;
		}
	
}
