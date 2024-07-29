import java.util.*;

class Avg_Arr{
	public static void main(String[] args){
		int arr[]={20,45,56};
		int n= arr.length;
		double sum=0;
		double Avg=0;
		for(int i=0;i<n;i++){
			sum+=arr[i];
		}
		Avg=sum/n;
		System.out.println("The sum of given array is:"+Avg);
	}
}