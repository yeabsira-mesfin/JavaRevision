import java.text.NumberFormat;

/**
 * NumberFormatting
 */
public class NumberFormatting {

    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(12345679.287);
        System.out.println(result);


      
        String resultPercent = NumberFormat.getPercentInstance().format(.56);
        System.out.println(resultPercent);
    }
}