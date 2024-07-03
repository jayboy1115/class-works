import java.util.Scanner;

public class Factors {

      public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      int number = 0;
      int factor = 0;
     
      System.out.println("Enter a number");
      number = input.nextInt();
      
        for(int count = 2; count <=number; count++) {

         if(number % count == 0){
               factor++;
          
         System.out.println("The factor is: " + count);
     }
   } 
	System.out.printf("This is the amount of factors in the number you entered: %d",  factor);
  }
}

