import java.util.*;

class ElementIndex{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int arr[] = {2,3,5,6,1};
		int n= arr.length;
		System.out.println("Enter the nummber to find the index:");
		int a = sc.nextInt();
		for(int i=0;i<n;i++){
			if(arr[i]==a){
				System.out.println(i);
			}
			
		}
	}
}