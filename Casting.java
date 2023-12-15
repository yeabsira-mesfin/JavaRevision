/**
 * Casting
 */
public class Casting {

    public static void main(String[] args) {
        // Implicit casting is where java creates anonymous variable to a different data type and copy the value to the one we are using, below is the example.
        // short and int are different data types so java will create anonymous variable and copy the value of x then adds it with y.
        // Whenever we have a value with a bigger data type it will be changed.
        // byte>short>int>long>float>double
        short x = 7;
        int y = 8;
        System.out.println(y+x);

        // Explicit casting, we cast values explicitly

        double z = 1.1;
        int a = (int)z+1;
        System.out.println(a);

        // When we have values that can't be casted like the below we have a wrapper class, for example Integer is a rapper class for int.

        String st= "1";

       
        int result =  Integer.parseInt(st) + 7;
        System.out.println(result);
           
    }
}