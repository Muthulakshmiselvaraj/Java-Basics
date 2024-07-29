import java.util.*;

class Sub_Array{
	public static void main(String[] args){
		int arr[]={2,4,6,3,7,8};
		int n=arr.length;
		System.out.println(Arrays.toString(subArray(arr)));
	}
	static int[] subArray(int arr[]){
		int maxlen=1,maxstart=0,start=0,end=0;
		int n = arr.length;
		for(int i=1;i<n;i++){
			if(arr[i]>arr[i-1]){
				end++;
			}
			else{
				if(end-start+1>maxlen){
					maxlen=end-start+1;
					maxstart=start;
				}
				start=i;
				end=i;
			}
		}
		if(end-start+1>maxlen){
			maxlen=end-start+1;
			maxstart=start;
		}
		int length=maxstart+maxlen;
		return Arrays.copyOfRange(arr,maxstart,length);
	}
}
	