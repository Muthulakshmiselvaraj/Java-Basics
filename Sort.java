import java.util.*;
import java.lang.*;
import java.io.*;

class Sort{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of the Names:");
		int n = sc.nextInt();
		System.out.println("Enter the Names:");
		String str[] = new String[n];
		for(int i=0;i<n;i++){
			str[i] = sc.next();
			
		}
		String temp;
		for(int i=0;i<n;i++){
			for(int j= i+1;j<n;j++){
				if(str[i].compareTo(str[j])>0){
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		System.out.println("The name in Alphabetical order:");
		for(int i=0;i<n;i++){
			System.out.println(str[i]);
		}
		
	}
	
}