import java.util.Scanner;

public class TaskFive {

      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	System.out.println("Enter ten scores");
        
	int evenNumbers = 0;
	int Count = 0;
	int sum = 0;

	 for(int count = 1; count <= 10; count++) {
	 System.out.printf("The even score numbers are %d%n", evenNumbers);
               evenNumbers = input.nextint();

         } if (evenNumbers % 2 == 0) {
             sum = sum + evenNumbers;
	     count = count++;
}
}
	System.out.println("The sum of evenNumbers is: %d", evenNumbers);
    }
   
