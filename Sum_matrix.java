import java.util.*;

class Sum_matrix{
	public static void main(String[] args){
		int arr_1[][]={ {1,2,3},{4,5,6},{7,8,9}};
		int arr_2[][]={ {1,2,3},{4,5,6},{7,8,9}};
		int a=arr_1.length;
		int b=arr_2.length;
		int arr_3[][]=new int[a][b];
		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++){
				arr_3[i][j]=arr_1[i][j]+arr_2[i][j];
				System.out.print(arr_3[i][j]+" ");
			}
			System.out.println();
		}
	}
}