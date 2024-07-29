import java.util.*;
import java.io.*;
import java.lang.*;
public class StringPermutation{
	public static void main(String []args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String:");
	String str = sc.nextLine();
	int len = str.length();
	System.out.println("Enter all the Permutaions");
	permutation(str,0,len);
}

public static void permutation(String str,int start,int end){
	if (start == end-1){
		System.out.println(str);
	}
	else{
		for(int i=start;i<end-1;i++){
			str = swapString(str,start,i);
			permutation(str,start+1,end);
			str = swapString(str,start,i);
	}
	}
}

public static String swapString(String s,int i,int j){
	char []b = s.toCharArray();
	char ch;
	ch = b[i];
	b[i] = b[j];
	b[j] = ch;
	return String.valueOf(b);
}
}