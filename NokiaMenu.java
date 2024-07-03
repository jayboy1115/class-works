import java.util.Scanner;

public class NokiaMenu {

      public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

	int n;

        System.out.println("Menu: ");
       
         String inputs = """
			     1: Phone book
			     2: Messages
			     3: Chat
			     4: Call register
			     5: Tones
			     6: Settings
			     7: Call divert
			     8: Games
			     9: Calculator
			    10: Reminders
			    11: Clock
			    12: Profiles
			    13: Sim services
					     """;

		 System.out.println(inputs);
	System.out.print("Press any number to get started: ");
         int number = input.nextInt();

                  switch(number) {
	      case 1: 
		System.out.println(" 1. Search ");
		break;
}
		switch(number) {
	      case 2:
		System.out.println(" 2. Service nos. ");
		break;
}
		switch(number) {
 	      case 3:
		System.out.println(" 3. Add name ");
		break;
}
		switch(number) {
 	      case 4:
		System.out.println(" 4. Erase ");
		break;
}
		switch(number) {
 	      case 5:
		System.out.println(" 5. Edit ");
		break;
}
		switch(number) {
              case 6: 
		System.out.println(" 6. Assign tone ");
		break;
}
		switch(number) {
	      case 7:
		System.out.println(" 7. Send b'card ");
		break;
}
		switch(number) {
 	      case 8:
		System.out.println(" 8. Options ");
		break;
   }
               
}
}