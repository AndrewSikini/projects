import java.util.Scanner;
public class SwitchPractice {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the grade or enter -1 to quit : ");
		int grade = scn.nextInt(); 
		int totalA = 0;
		int totalB = 0;
		int totalC = 0;
		int totalD = 0;
		int totalF = 0;
		
		
		while(grade != -1) {
			switch (grade / 10) {
			
			case 9: case 10:
				totalA++;
				break;
			case 8: 
				totalB++;
				break;
			case 7: 
				totalC++;
				break;
			
			case 6: 
				totalD++;
				break;
			default:
				totalF++;
				break;
			}
			System.out.print("Enter the grade or enter -1 to quit : ");
			grade = scn.nextInt(); 
		}
		
		System.out.printf("Total A's are %d%n Total B's are %d%n Total C's are %d%n ", totalA, totalB, totalC);
	}
	

}
