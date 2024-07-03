import java.util.Scanner;

public class EvenIndices {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
   
	int scores = 0;
	int counter;
	int EvenIndices = 0;

	for(counter = 1; counter <= 10; counter++) {
          System.out.println("Enter a score: ");
	    scores = input.nextInt();
      
          
       if (counter % 2 == 0) {
	   EvenIndices = EvenIndices + scores;
	   
}
  }
System.out.printf("tne sum of the even numbers is %d", + EvenIndices);
     

}
}
