import java.util.*;
class FirstCommon{
	public static void main(String[] args){
		String s= "javaprogram";
		boolean f=true;
		for(char i:s.toCharArray()){
			if(s.indexOf(i)==s.lastIndexOf(i)){
				System.out.println("The first repeating char  is "+ i);
				f =false;
				break;
			}
		}
		if(f==true){
			System.out.println("There is no non repeating char");
		}
	}
}