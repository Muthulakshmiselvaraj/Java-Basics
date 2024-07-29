import java.util.*;

class Num_pat{
	public static void main(String[] args){
		int i,j,n=5,count=1;
		for(i=n;i>0;i--){
			for(j=1;j<=i*2;j++){
				System.out.print(" ");
				
			}
			for(j=1;j<=count;j++){
				System.out.print(j+" ");
				
			}
			for(j=count-1;j>=1;j--){
				System.out.print(j+" ");
				
			}
			
			
			System.out.println();
			count++;
		}
	}
}