import java.util.*;
   class Hollow_diam{
	   public static void main(String [] args){
		   int i,j,k,n=7;
		   for(i=1;i<=n;i++){
			   for(j=n;j>i;j--){
				   System.out.print(" ");
			   }
			   System.out.print("*");
			   for(k=1;k<2*(i-1);k++){
				   System.out.print(" ");
			   }
			   if(i==1){
				   System.out.println("");
			   }
			   else{
				   System.out.println("*");
			   }
		   }
		   //bottom
		     for(i=n-1;i>=1;i--){
			   for(j=n;j>i;j--){
				   System.out.print(" ");
			   }
			   System.out.print("*");
			   for(k=1;k<2*(i-1);k++){
				   
				   System.out.print(" ");
			   }
			   if(i==1){
				   System.out.println("");
			   }
			   else{
				   System.out.println("*");
			   }
		   }
	   }
   }
