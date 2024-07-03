import java.util.Scanner;

public class EvenIndices {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
          System.out.print("Enter ten scores");
     
	int scores = 0;
	int indices;
	int evenindices = 0;

	for(indices = 1; indices <= 10; indices++) {
          System.out.print("Enter a score");
	     scores = input.nextInt();
      
          
       if (indices % 2 == 0) {
	   evennumbers = evenindices + scores;
}
	System.out.printf("tne sum of the even numbers is %d", evennindices);
     
  }
}
}
