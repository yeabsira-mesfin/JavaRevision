import java.util.Scanner;

/**
 * Input
 */
public class Input {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Please enter your age ");
        // float age = scanner.nextFloat();
        // System.out.println("Your age is " + age);

        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        
        System.out.println("Your name is:" + name);

    }
}