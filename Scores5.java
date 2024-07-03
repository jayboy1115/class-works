import java.util.Scanner;

public class Scores5 {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          
          System.out.print("Enter ten scores: ");

            double score1 = scanner.nextDouble();
            double score2 = scanner.nextDouble();
            double score3 = scanner.nextDouble();
            double score4 = scanner.nextDouble();
            double score5 = scanner.nextDouble();
            double score6 = scanner.nextDouble();
            double score7 = scanner.nextDouble();
	    double score8 = scanner.nextDouble();
	    double score9 = scanner.nextDouble();
	    double score10 = scanner.nextDouble();
          
            double sum = (score1 + score2 + score3 + score4 + score5 + score6 + score7 + score8 + score9 + score10);
             double average = sum / 10 ;
System.out.println("the sum of all score is " + sum);
  System.out.print( "the average is " + average);            
   }
}

            
           
         
            
                                
  