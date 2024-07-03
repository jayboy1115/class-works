import java.util.Scanner;
public class Zero1 {

public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

	  int count;
 	  count = 0;
	 
         
          while (count <= 10) {

	   System.out.print("Enter a number: ");
	 int number = input.nextInt();
             count++;

           if (number == 0)
	   System.out.println("zero");

	  else if ( number == 1)
	   System.out.println("one");

       	   else if ( number == 2)
	   System.out.println("two");

	   else if ( number == 3)
	   System.out.println("three");

	   else if ( number == 4)
	   System.out.println("four");

	   else if ( number == 5)
	   System.out.println("five");

	   else if ( number == 6)
	   System.out.println("six");
 
	   else if ( number == 7)
	   System.out.println("seven");

 	   else if ( number == 8)
	   System.out.println("eight ");

            else if ( number == 9)
	   System.out.println("nine");


	   else if ( number == 10)
	   System.out.println("ten");

            else
            System.out.println("Invalid number ");
          

	}
   }
}