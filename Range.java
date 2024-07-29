import java.util.*;

class Range{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number between 1 to 100:");
		int a = sc.nextInt();
		if(a>1&&a<=50){
			System.out.println("The Number is in the Lower half");
		}
		else if(a>50 && a<=100){
			System.out.println("The Number is in the upper half");
		}
		else{
			System.out.println("The Number is Out of the Range");
		}
	}
}