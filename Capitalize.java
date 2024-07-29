import java.util.*;

class Capitalize{
	public static void main(String[] args){
		String s ="i want become a developer";
		StringBuffer sb=new StringBuffer();
		String[] word = s.split("\\s");
		for(String words:word){
			sb.append(Character.toTitleCase(words.charAt(0)))
			          .append(words.substring(1))
			          .append(" ");
		}
		s=sb.toString();
		System.out.println(s);
	}
}