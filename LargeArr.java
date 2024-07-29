import java.util.*;

class LargeArr{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		System.out.println("Enter the Elements:");
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		int max=arr[0];
		int min = arr[0];
		for(int i=0;i<n;i++){
			if(arr[i]>max){
				max = arr[i];
			}
			else if(arr[i]<min){
				 min= arr[i];
			     
			}
		}
		System.out.println("Maximum value of the array is :"+max);
		System.out.println("Minimumm value of the array is:"+min);
		
	}
}
				