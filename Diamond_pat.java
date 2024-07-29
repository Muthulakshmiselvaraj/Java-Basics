import java.util.*;

class Diamond_pat{
	public static void main(String[] args){
		int i,j,k,n=4 ;
		//nested for loop for create a pattern
		for(i=0;i<n;i++){
			for(k=1;k<=n-i;k++){
				System.out.print(" ");
				
			}
			for(j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=n;i>=0;i--){
			for(k=1;k<=n-i;k++){
				System.out.print(" ");
				
			}
			for(j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}