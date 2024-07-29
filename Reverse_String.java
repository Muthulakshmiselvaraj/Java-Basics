import java.util.*;

class Reverse_String{
	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the String:");
		String s=sc.next();
		int n= s.length();
		for(int i=n-1;i>=0;i--){
			System.out.print(s.charAt(i));
		}
		
	}
}