public class Kata {

       public static boolean isEven(int number) {
	  
	  int result;
	  result = (number % 2);
	          if(result == 0) {
	 return true;
}        else {
         return false;
  }
}

     public static Boolean isPrimeNumber(int number) {
           int counter = 1;
	   int factorCounter = 0;

           while (counter <= number) {
               int argumentValue = (number % counter);
	       if(argumentValue == 0 && counter != 1){
}
                 factorCounter = factorCounter + 1;
        
                    counter = counter + 1;
}
	     return (factorCounter == 1 ? true : false);
}
}	      
     