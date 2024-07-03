import java.util.Scanner;
public class MineBankingApp {

public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         System.out.print("Welcome to mine banking app ");
         

	 System.out.print("Press 1 or 0 to quit: ");
	 int value = input.nextInt();
	 

	switch(value) {

	  case 1:

             String inputs = """
				1: transfer
				2: buy airtime
				3: buy data
				4: share data
				99: go back
					     """;
		System.out.println(inputs);
	System.out.print("Press any number to get started: ");
         int number = input.nextInt();
		
         switch(number) {
	      case 1: 
		System.out.println(" transfer ");
		break;

	      case 2:
		System.out.println(" airtime ");
		break;

 	      case 3:
		System.out.println(" buy data ");
		break;

 	      case 4:
		System.out.println(" share data ");
		break;

 	      case 99:
		System.out.println(" go back ");
		break;


		default:
                System.out.print("We are always here for you ");
	}
   }
}
}
		
