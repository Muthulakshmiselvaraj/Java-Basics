import java.util.*;

class Ascend_Descend{
	public static void main(String[] args){
		int arr[]={10,40,20,30,70};
		int n= arr.length;int i;
		for( i=0;i<n;i++){
			//int Des[]=new int[];
			for(int j=i;j<n;j++){
				int temp=0;
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
	}System.out.println("Display the Acending Elements:");
	
	for(i=0;i<n;i++){
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	
		for( i=0;i<n;i++){
			
			for(int j=i;j<n;j++){
				int temp=0;
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
	}System.out.println("Display the  descending Elements:");
	for(i=0;i<n;i++){
		System.out.print(arr[i]+" ");
	}
	}
}