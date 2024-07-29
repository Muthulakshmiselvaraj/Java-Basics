import java.util.*;

public class Large_Arr{
	public static void main(String[] args){
		int arr[] ={10,20,50,70,40,30};
		int n=arr.length;
		int max = arr[0];
		for(int i=1;i<n;i++){
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println("The Largest Array Integer is :"+max);
	}
}
			