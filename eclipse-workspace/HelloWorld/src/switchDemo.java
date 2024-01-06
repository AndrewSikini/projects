import java.util.Scanner;
public class switchDemo {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a zip code: ");
		String zip = scn.nextLine();
		char z1 = zip.charAt(0);
		while(z1 != 'q') {
		switch(z1) {
		case '7':
			System.out.println("Southern region");
		 break;
		case '0':
			System.out.println("Eastern region");
			break;
		case '9':
			System.out.println("Western region");
			break;
			default:
			System.out.println("Undefined region");
		break;
			}
		System.out.print("Enter a zip code or q to quit: ");
		zip = scn.nextLine();
		z1 = zip.charAt(0);
		}
		System.out.println("Program terminated. ");
	}
}

