import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
   
	int odd;
	int sum = 0;
	int scores;

	for(odd = 1; odd <= 10; odd++) {
          System.out.println("Enter a score: ");
	    scores = input.nextInt();
      
          
       if (odd % 2 == 1) {
	   sum = sum + scores;
	   
}
  }
System.out.printf("tne sum of the odd is %d", + odd);
     

}
}
