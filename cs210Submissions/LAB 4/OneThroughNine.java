// Samneet Singh
// October 16, 2020
// Code to take an integer input and diplay a fun fact about it

// import java scanner
import java.util.Scanner;
public class OneThroughNine {

   public static void main(String[] args){
   
   // create a scanner
   Scanner Keyboard = new Scanner(System.in);
   
   // collect user's integer
   int UserInteger;
   System.out.println("Pick a number, 1-9, that you want to know a fun fact about:  ");
   UserInteger = Keyboard.nextInt();
   
   // write switch statement with cases which include fun facts
      switch (UserInteger) {
         case 1:
            System.out.println("1 can be written as 1*1, thus it has two factors, but they both are not different and hence it is not a prime number");
            break;
         case 2:
            System.out.println("2 is the only prime number that is even and it is the smallest prime number");
            break;
         case 3:
         case 9:
            System.out.println("3 squared is 9, and the square root of 9 is 3");
            break;
         case 4:
            System.out.println("4 is the smallest perfect square greater than 1");
            break;
         case 5:
            System.out.println("5 is one-quarter of 20. Wow!");
            break;
         case 6:
            System.out.println("6 is the smallest number that is equal to the sum of proper divisors. Interesting!");
            break;
         case 7:
         case 8:
            System.out.println("The numbers 7 and 8 are both less than 9. Amazing!");
            break;
      }
   }
}