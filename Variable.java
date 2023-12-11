import java.sql.Date;

class Variable{
    public static void main(String[] args){
        int age = 30;
        long views = 3099_999_999l;
        float price = 10.99f;
        char letter = 'a';
        boolean isEligible = false;
        System.out.println(age);
        System.out.println(views);
        System.out.println(price);
        System.out.println(letter);
        System.out.println(isEligible);
        // Date now = new Date(); 
        // System.out.println(now);
        int x = 6;
        int y = x;
        x = 7;
        System.out.println(y);
        // in primitive types the variables refer to the value and in refernce types they refer to the memory address. 
    }
}      