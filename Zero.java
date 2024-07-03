import java.util.Scanner;
public class Zero {

public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         int number = 0;

         System.out.print("Enter a number (or -1 to quit): ");
	 int number = input.nextInt();
	 
         
          while (int number != -1) {

          if (number == 0)
	   System.out.print("zero");

	  else if ( number == 1)
	   System.out.print("one");

       	   else if ( number == 2)
	   System.out.print("two");

	   else if ( number == 3)
	   System.out.print("three");

	   else if ( number == 4)
	   System.out.print("four");

	   else if ( number == 5)
	   System.out.print("five");

	   else if ( number == 6)
	   System.out.print("six");
 
	   else if ( number == 7)
	   System.out.print("seven");

 	   else if ( number == 8)
	   System.out.print("eight ");

            else if ( number == 9)
	   System.out.print("nine");

	   else if ( number == 10)
	   System.out.print("ten");

            else
            System.out.print("Thank you ");

            
             
          

	}
  }
}