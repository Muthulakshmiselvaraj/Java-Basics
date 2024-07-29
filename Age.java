import java.util.*;

class Age{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int a = sc.nextInt();
		
		if(a>=18){
			System.out.println("You are an Adult");
		}
		else
			System.out.println("You are not yet an adult");
	}
}