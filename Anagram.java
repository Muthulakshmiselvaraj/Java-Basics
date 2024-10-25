import java.util.Arrays;
class Anagram{
	public static void main(String[] args){
		String s1 ="hello";
		String s2="ehlol";
		 if(s1.length()!=s2.length()){
			 System.out.println("Not a Angram");
		 }
		 else
		 {   char[] st1=s1.toLowerCase().toCharArray();
	         char[] st2=s2.toLowerCase().toCharArray(); 
			 Arrays.sort(st1);
			 Arrays.sort(st2);
			 if(Arrays.equals(st1,st2)){
				 System.out.println("Is a Anagram");
			 }
			 else
				 System.out.println("Not a Angram");
		 }
	}
}
		
