import java.util.*;

class RemoveSpace{
	public static void main(String[] args){
		String s=" i want become a  developer";
		char[] str=s.toCharArray();
		StringBuffer stringBuffer=new StringBuffer();
		for(int i=0;i<str.length;i++){
			
			if((str[i]!=' ' )&&(str[i]!='\t')){
				stringBuffer.append(str[i]);
			}
		}
		System.out.println(stringBuffer);
	}
}
				
				