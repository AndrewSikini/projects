public class BasicForLoopDemo {

	public static void main(String[] args) {
		
		
		for(int i = 0; i <= 5 ; ++i)
			if (i%2 == 0)
			System.out.printf(" %d ",i);
		
         int counter = 0;
         while(counter<=5) {
       		System.out.println();
        	 System.out.println(counter);
			counter++;
		}
         
         do {
      		System.out.println();
 			System.out.println(counter);
 			counter++;
 		}while (counter <= 5);

    

}}