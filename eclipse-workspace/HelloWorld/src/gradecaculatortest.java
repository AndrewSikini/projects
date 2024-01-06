import java.util.Scanner;
public class gradecaculatortest {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int grade=0;
        System.out.println("Please enter grade:");
        grade=scn.nextInt();
        
        Helloworld gc = new Helloworld(0);
        int sentineValue =0;
        while (sentineValue != -1) {
        	gc.addGrade(grade);
        	System.out.println("do you wish to continue if no enter -1")l
        	sentineValue = scn.nextInt();
        	// get user input
        	// create array
        }
	
}
}