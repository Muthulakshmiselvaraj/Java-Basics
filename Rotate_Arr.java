import java.util.*;

class Rotate_Arr{
public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the Number of the Elements:");
	int n=sc.nextInt();
	System.out.println("Enter the  Elements:");
	int arr[]=new int[n];
        for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		  
	    }
System.out.println("Dispaly the  Elements:");
        for(int i=0;i<n;i++){
			
		  System.out.print(arr[i]+" ");
	    }
		System.out.println();
		System.out.println("Enter the number which position will be Changed:");
		int a = sc.nextInt();
		for(int i=0;i<a;i++){
			int last=arr[n-1];
			for(int j=n-1;j>0;j--){
				
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		System.out.println();
		
		System.out.println("Dispaly the After"+a+" times Rotated  Elements:");
        for(int i=0;i<n;i++){
			
		  System.out.print(arr[i]+" ");
	    }
}
}
