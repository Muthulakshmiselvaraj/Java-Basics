import java.util.*;
import java.io.*;
import java.lang.*;
class Factorial{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a = sc.nextInt();
		factorial(a);
		int f=1;
        f = factorial(a);
		System.out.println(f);
	}
	public static int factorial(int num){
		
		if(num==0){
			return 1;
		}
		else{
		
	    return num*factorial(num-1);
		
		}
		
	
	}
	
}