public class HelloWorld {
	private String name;
	private int grade = 0;
	private int sum = 0;
	
	public HelloWorld(String name, int grade) {
		this.name = name; 
		this.grade = grade; 
		
	}
	public void addGrade(int g) {
		sum = sum + g;
	}
	public char calculateGrade() {
	
	if(grade >= 90) { 
			return 'A';
	
	}
	else if (grade >= 80)
			return 'B';
	else  if(grade >= 70)
			return 'C';
	else if(grade >=60)
			return 'D';
	else
			return 'F';
				
	}

}



		



