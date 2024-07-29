import java.util.*;
class Ran_2{
	public static void main(String[] args){
		int attempt=0;
		Random rand = new Random(1);
		int ans = rand.nextInt(100)+1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number between 1 to 100");
		
		while(true){
			int a = sc.nextInt();
			attempt++;
			if(ans>a){
				System.out.println("The number is too low,Try again");
			}
			else if(ans<a){
				System.out.println("The number is too high,Try again");
			}
			else{
				System.out.println(" Your answer is correct");
			}
		}
	}
}