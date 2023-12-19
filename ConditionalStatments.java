import java.util.Scanner;

/**
 * ConditionalStatments
 */
public class ConditionalStatments {

    public static void main(String[] args) {
        int temprature;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the temprature");
        temprature = input.nextInt();
       
        if(temprature>32){
            System.out.println("The wetather is hot");
        } else if (temprature >20) {
            System.out.println("Beautiful day");
        }
        else 
        System.out.println("Cold day");
    }
}