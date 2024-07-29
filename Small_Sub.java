import java.util.*;

class Small_Sub{
	public static void main(String[] args){
		int arr[]={2,4,6,3,7,8};
		System.out.println(Arrays.toString(subArray(arr)));
	}
	static int[] subArray(int arr[]){
		int n = arr.length;
		int minlen=n+1,minstart=0,start=0,end=0;
		
		for(int i=1;i<n;i++){
			if(arr[i]>arr[i-1]){
				end++;
			}
			else{
				if(end-start+1<minlen){
					minlen=end-start+1;
					minstart=start;
				}
				start=i;
				end=i;
			}
		}
		if(end-start+1<minlen){
			minlen=end-start+1;
			minstart=start;
		}
		int length=minstart+minlen;
		return Arrays.copyOfRange(arr,minstart,length);
	}
}
	