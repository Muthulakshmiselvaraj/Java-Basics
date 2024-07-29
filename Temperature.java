import java.util.*;
 
 class Temperature{
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter The Temperature:");
		 float c = sc.nextFloat();
		 float f = (c*9/5)+32;
		 System.out.println("The Temperature in Fahrenheit is :" +f);
	 }
 }