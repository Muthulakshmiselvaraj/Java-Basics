import java.util.*;

class Subset{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers:");
		int a = sc.nextInt();
		System.out.println("Enter the Elements:");
		int arr[] = new int[a];
		for(int i=0;i<a;i++){
			 arr[i] = sc.nextInt();
		}
		subset(arr);
	}
	
	public static void subset(int[] a){
		for(int i=0;i<a.length;i++){
			for(int j=i;j<a.length;j++){
				for(int k=i;k<=j;k++){
					System.out.print(a[k] +" ");
				}
				System.out.println();
			}
		}
	}
}
