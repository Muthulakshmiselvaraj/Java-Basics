import java.util.*;

class ThirdLarge{
	public static void main(String[] args){
		int arr[] ={100,30,40,50,60};
		int n = arr.length;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				int temp;
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
				    arr[j]=temp;
				}
				
			}
			
		}System.out.println(arr[n-3]);
	}
}