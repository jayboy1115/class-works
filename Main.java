import java.util.Scanner;

public class Main {

       public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

	  int number;

         System.out.println("enter a number");
	  number = input.nextInt();

         Boolean factorCounter = Kata.isPrimeNumber(number);

	 System.out.println(factorCounter);
   }
 }