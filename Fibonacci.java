import java.util.*;
import java.io.*;
import java.lang.*;
class Fibonacci{
	public static void main(String[] args){
		System.out.println("Fibonacci Series:");
		int n1,n2,n3,i;
		n1=0;n2=1;
		System.out.println(n1 +" "+ n2);
		int count = 10
		for(i=2;i<=count;i++){
			n3= n1+n2;
			n1=n2;
			n2=n3;
			
		
			
			System.out.println(n3);
		}
	}
}