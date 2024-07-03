import java.util.Scanner;

public class PrimeNumbers1 {

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

	 if(count <= 1);
         System.out.println("This number is a prime number");
 
     }
  }
}
}

