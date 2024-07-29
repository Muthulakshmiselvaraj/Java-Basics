import java.util.*;
class CommonElement{
	public static void main(String[] args){
		int arr_1[]={2,4,6,8,10};
		int arr_2[]={4,8,3,10,9};
		int a = arr_1.length;
		int b = arr_2.length;
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
				if(arr_1[i]==arr_2[j]){
					System.out.println(arr_1[i]);
				}
			}
		}
	}
}