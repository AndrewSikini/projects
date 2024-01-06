module OddorEven {
}
import java.util.Scanner;

public class OddorEven {
	public static void main(String[] args) {
		int number;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number= scn.nextInt();
		if (number % 2 == 0)
			System.out.printf("%d is an even number", number);
		if (number % 2 != 0)
			System.out.printf("%d is an odd number", number);
		
	}
}
