public class CompoundInterest {

	public static void main(String[] args) {
		
		double principal = 1000.0;
		double amount = 0;
		double rate = 0.05;
		double years = 10; 
		
		//amount = principal(1 + r)raised to power of n
		System.out.printf("%s%20s%n", "Year", "Amount");
		
		for(int i = 0; i <= 10; i++) {
			amount = principal*Math.pow(1 + rate,i);
			System.out.printf("%4d%20.2f%n", i, amount);
			
		}

	}

}
