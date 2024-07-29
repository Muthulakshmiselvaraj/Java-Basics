import java.util.*;

class PalinString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		String str=s.trim();
		
		int n = str.length()-1;
		System.out.println(palin(str,0,n));
	}
	 static boolean palin(String str, int i,int j){
	
			if(str.charAt(i) != str.charAt(j)){
				return false;
			}
			if(j<=i){
				return true;
			}
		return palin(str,i+1,j-1);
	}
}
			