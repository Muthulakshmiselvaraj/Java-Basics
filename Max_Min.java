import java.util.*;

public class Max_Min{
	public static void main(String[] args){
		int arr[] ={20,10,50,70,40,30};
		int n=arr.length;
		int max = arr[0];
		int min= arr[0];
		for(int i=1;i<n;i++){
		if(arr[i]>max){
				max=arr[i];
		}
		else if(arr[i]<min){
			min=arr[i];
		}
	}
		System.out.println("The Largest Array Integer is :"+max);
		System.out.println("The Largest Array Integer is :"+min);
		
		
	}
}