/**
 * LogicalOperators
 */
public class LogicalOperators {

    public static void main(String[] args) {
        int temprature = 51, temprature2=4,temprature3 =20;
        boolean isWarm = temprature > 50 && temprature < 52;
        boolean isCold = temprature2 >-273 || temprature2  <= 8;
        boolean roomTemprature = (isWarm && isCold) || temprature3 == 20;
        System.out.println(isWarm);
        System.out.println(isCold);
        System.out.println(roomTemprature);
    }
}