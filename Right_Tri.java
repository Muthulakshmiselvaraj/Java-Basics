import java.util.*;

class Right_Tri{
	public static void main(String[] args){
		int i,j,n=6 ;
		//nested for loop for create a pattern
		for(i=0;i<n;i++){
			for(j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}