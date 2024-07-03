import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

      System.out.print("Enter ten scores: ");

            int score1 = scanner.nextInt();
            int score2 = scanner.nextInt();
            int score3 = scanner.nextInt();
            int score4 = scanner.nextInt();
            int score5 = scanner.nextInt();
            int score6 = scanner.nextInt();
            int score7 = scanner.nextInt();
	    int score8 = scanner.nextInt();
	    int score9 = scanner.nextInt();
	    int score10 = scanner.nextInt();
          
            int average = (score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10 / 10);
	
	     System.out.println("the average of all score is " + average);
}
}