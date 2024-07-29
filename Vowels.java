import java.util.*;
class Vowels{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.nextLine();
		s=s.toLowerCase();
		System.out.println(checkVow(s));
	}
	public static boolean checkVow(String s){
		
		for(int i= 0;i<s.length();i++){
			
		  if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u' ){
		      return true;
		 
		   }
		   else{
			return false;
	       }
        }
		return true;
	}
}