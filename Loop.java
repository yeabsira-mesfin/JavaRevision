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
        // do{
        //     System.out.println("Please enter your user name");
        //     input = scanner.nextLine().toLowerCase();
        //     // if(!input.equals("quit"))
        //     if(input.equals("pass"))
        //     continue;
        //      if(input.equals("quit"))
        //      break;
        //     System.out.println(input);
        // }
        // while(true);
        
        String[] fruits = {"Mango","Apple","Banana"};
        // for(int i=0;i<fruits.length;i++){
        //     System.out.println(fruits[i]);
        // }
        // For each loop has few limitations, such as it is forward where you can't iterate back ward
        // you don't have access to the index.
        for(String fruit: fruits){
            System.out.println(fruit);
        }

        }
}