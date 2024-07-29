import java.util.*;

class RandomNum{
	public static void main(String[] args){
		
		Random random = new Random();
		int ans = random.nextInt(10)+1;
		Scanner sc = new Scanner(System.in);
		 int attempt = 0;
		
		System.out.println("Enter the Number Between 1 to 10");
		
		while(true){
			int a = sc.nextInt();
			attempt++;
		if(a>ans){
			System.out.println("You are too high,Try again");
		}else if(a<ans){
			System.out.println("You are too low,Try again");
		}
		else{
			System.out.println("You are correct!");
			break;
		}
		
	    }
			}
}
