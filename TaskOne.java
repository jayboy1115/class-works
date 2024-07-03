import java.util.Scanner;

public class TaskOne {

     public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

     
     int sum = 0;

	for(int count = 1;count <= 10;) {

	   System.out.print("Enter a number: ");
	 int number = input.nextInt();
          sum = sum + number;
           count++;
     }

     System.out.println(" sum is " + sum);

   }
}
