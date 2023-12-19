import java.util.Scanner;

/**
 * FizzBuzz
 */
public class FizzBuzz {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Please enter the number");
       int num = input.nextInt();
       if ((num%5==0) && (num%10==0)) {
        System.out.println("Fizz Buzz");
       } 
      else if (num%10==0) {
        System.out.println("Buzz");
       }
       else   if(num%5==0){
        System.out.println("Fizz");
       } else 
       System.out.println(num);
    }
}