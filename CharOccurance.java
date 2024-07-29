import java.util.*;

class CharOccurance{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String s = sc.next();
		System.out.println("Enter the char to remove:");
		String st = sc.next();
		char ch = st.charAt(0);
		check(s,ch);
	}
	static void check(String s, char ch){
		char[] c= s.toCharArray();
         int count=0,j=0;
          int n = s.length();
         for(int i=j=0;i<n;i++){
           if(c[i]!=ch){
              c[j++]=c[i];	
		   }
          else
            count++;			  
		 }
		 while(count>0){
			 c[j++]='\0';
			 count--;
		 }
		 System.out.println(c);
	}
}