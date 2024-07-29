import java.util.*;

class Distint{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int[] arr = {2,5,8,9,4,2,4};
		int n = arr.length;
		for(int i=0;i<n;i++){
			boolean  isDis=true;
			for(int j=0;j<i;j++){
				if(arr[i]==arr[j])
					isDis=false;
				break;
			}
			if(isDis){
					System.out.print(arr[i]+" ");
			}
			}
		}
		
	}

			
