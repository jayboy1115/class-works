import java.util.Scanner;

public class BreakCode {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     int scores = 0;
     int sum = 0;


	for(int counter = 1; counter <= 10; counter++){
	  System.out.print("Enter a score: " );
	     scores = input.nextInt();

	     if(counter == 5) {
	      break;
	      }
           sum += scores;
}
    System.out.printf("The sum is %d", + sum);
    }
  }


   
      