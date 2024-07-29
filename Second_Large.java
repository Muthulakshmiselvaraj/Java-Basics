import java.util.*;

class Second_Large{
	public static void main(String[] args){
		int arr[]={10,40,20,30,70};
		int n= arr.length;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				int temp=0;
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}System.out.print(arr[n-2]);
	}
}