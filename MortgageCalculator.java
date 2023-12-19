import java.text.NumberFormat;
import java.util.Scanner;

/**
 * MortgageCalculator
 */
public class MortgageCalculator {

    public static void main(String[] args) {
        final byte Months_In_Year =12;
        final byte Percent = 100;

        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / Percent / Months_In_Year;

        System.out.println("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * Months_In_Year;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest,numberOfPayments))/
         ( Math.pow(1+monthlyInterest,numberOfPayments) - 1);

        String mortgageFromatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(mortgageFromatted);


    }
}