import java.util.Scanner;

public class TaskFour {

      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome");
          
        int evenindex;
	int sum = 0;
	int scores;

	for(evenindex = 1; evenindex <= 10; evenindex++) {
          System.out.println("Enter a score: ");
	    scores = input.nextInt();

	 if (evenindex % 2 == 1) {
	   sum = sum + scores;
    }
}
     System.out.printf("tne sum of the evenindex is %d", + evenindex);
    }
}