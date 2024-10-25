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

class Anagram{
	public static void main(String[] args){
		String a = "Anagram";
		String b = "Nagaram";
		if(a.length() != b.length()){
			System.out.println("Not an Anagram");
		}
		else{
			String A = a.toUpperCase();
			String B = b.toUpperCase();
			String C = B;
			for(int i = 0;i<A.length();i++){
				for(int j =0;j<B.length();j++){
					if(A.charAt(i) == B.charAt(j)){
						C = C.replaceFirst(""+A.charAt(i),"");        //C = C.replaceFirst(Character.toString(A.charAt(i)),"");
					}
				}
			}
			if(C.length() == 0){
				System.out.println("Is An Anagram");
			}
			else{
				System.out.println("Not An Anagram");
			}
		}
	}
}
				                                                           
		
