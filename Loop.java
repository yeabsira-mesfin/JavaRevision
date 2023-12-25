import java.util.Scanner;

/**
 * FoorLoop
 */
public class Loop {

    public static void main(String[] args) {
        // for(int i = 1; i<=5;i++)
        // System.out.println("Looping five times:" + i);\
        Scanner scanner = new Scanner(System.in);
        String input = "";
        // while(!input.equals("quit")){
        //     System.out.println("Please enter your user name");
        //      input = scanner.nextLine().toLowerCase();
        //      System.out.println(input);
        // }
        do{
            System.out.println("Please enter your user name");
            input = scanner.nextLine().toLowerCase();
            System.out.println(input);
        }
        while(!input.equals("quit"));
        }
}