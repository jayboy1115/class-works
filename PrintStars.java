import java.util.Scanner;

public class PrintStars {

     public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

          int n = 5;

         for (int i = 1; i<=n; i++) {
           for (int j = 1; j<=n; j++) {
               System.out.print("* ");
      }
             System.out.println();
   }
}
}