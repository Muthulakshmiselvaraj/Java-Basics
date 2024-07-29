import java.util.*;

class GCD{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
	     System.out.println(gcd(a,b));
	}
	
	public static int gcd(int a,int b){		
	   int min;
	   if(a<b){
		    min = a;
	   }
	   else{
		   min = b;
	   }
	   for(int i=min;i>=1;i--){
		   if(a%i == 0 && b%i==0){
			   return i;
		   }
	   }
	   return 1;
	}
}