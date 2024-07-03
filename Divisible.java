import java.util.Scanner;

public class Divisible {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

	System.out.println("Welcome");

	int number;

	System.out.println("Enter a number");
	   number = input.nextInt();

            int first = (number % 5);
            int second = (number % 3);

	if(first == 0 && second == 0){
	   System.out.printf("the first number %d is divisible by 5 and 3", + number);

}	else{
	   System.out.printf("the first number %d is not divisible by 5 and 3", + number);
  }
 }
}

