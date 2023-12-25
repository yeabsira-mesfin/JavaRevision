import java.text.NumberFormat;
import java.util.Scanner;

/**
 * MortgageCalculator
 */
public class MortgageCalculator {

    public static void main(String[] args) {
        final byte Months_In_Year =12;
        final byte Percent = 100;
        float monthlyInterest = 0;
        int numberOfPayments = 0;
        byte years = 0;

        Scanner scanner = new Scanner(System.in);
        int principal = 0;
        float annualInterest = 0;
        while (true) {
            System.out.println("Principal: ");
            principal = scanner.nextInt();
             if(principal >= 1000 && principal <= 1000000)
             break;
             {
            System.out.println("Enter a value greater than or equal 0 and less than or euqal to 1000000");    
        }}
        while (true) {
            System.out.println("Annual Interest Rate: ");
            annualInterest = scanner.nextFloat();
            if(annualInterest >=1 && annualInterest<=30){
                monthlyInterest = annualInterest / Percent / Months_In_Year;
                break;
            }
            System.out.println("Enter a value between 1 and 30");  
        }
       while (true) {
        
           System.out.println("Period (Years): ");
           years = scanner.nextByte();
           if(years>=1 && years<=30){
            numberOfPayments = years * Months_In_Year;
             break;
            }
             System.out.println("Enter a value between 1 and 30");
             
             
            }
            double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest,numberOfPayments))/
             ( Math.pow(1+monthlyInterest,numberOfPayments) - 1);
             String mortgageFromatted = NumberFormat.getCurrencyInstance().format(mortgage);
             System.out.println(mortgageFromatted);
    }
}