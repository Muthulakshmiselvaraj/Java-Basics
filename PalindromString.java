import java.util.*;

class PalindromString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.nextLine();
		//s = s.lowerCase();
		System.out.println(findPalindrom(s,0,s.length()-1));
	}
	static boolean findPalindrom(String s,int i,int j){
		if(s.charAt(i) != s.charAt(j)){
			return false;
		}
		if(j<=i){
			return true;
		}
		return findPalindrom(s,i+1,j-1);
	}
}


			
	