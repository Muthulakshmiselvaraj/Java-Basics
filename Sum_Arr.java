import java.util.*;
class Sum_Arr{
	public static void main(String[] args){
		int arr[]={20,40,50};
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		System.out.println("The sum of given array is:"+sum);
	}
}