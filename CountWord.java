import java.util.*;

class CountWord{
	public static void main(String[] args){
		String s ="i want become a developer";
		//StringBuffer sb=new StringBuffer();
		String[] word = s.split("\\s");
		int n=word.length;
		System.out.println(n);
	}
}