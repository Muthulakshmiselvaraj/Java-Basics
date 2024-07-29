import java.util.*;

class CheckNum {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int a = sc.nextInt();
		if(a<0){
			System.out.println(a+" is a Negative Number");
		}
		else if(a>0){
			System.out.println(a+" is a Positive Number");
		}
		else{
			System.out.println(a+" is a Zero");
			}
	}
}