import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Operators = + - / %
		
		int friends = 10;
		double money = 150;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Hey, I'm DarkSide, I have "+friends+" friends. How many people want to be my new friend?");
		friends += scanner.nextInt();
		
		System.out.println("Awesome, now I have "+friends+" friends!!");
		
		money /= friends;
		
		System.out.println("I had $150, and I shared it to all my friends. Each one received an amount of $"+money);

	}

}
