import java.util.*;

class Staircase_pat{
	public static void main(String[] args){
		int i,j,k,n=6;
		for(i=1;i<=n;i++){
			if(i%2!=0){
			k=i+1;
			}
			else{
				k=i;
			}
			for(j=0;j<k;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}