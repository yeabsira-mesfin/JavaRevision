/**
 * MathClass
 */
public class MathClass {

    public static void main(String[] args) {
        int round = Math.round(1.6f);
        System.out.println(round);
        int floor = (int)Math.floor(3.6f);
        System.out.println(floor);
        int ceil = (int)Math.ceil(3.1f);
        System.out.println(ceil);
        int min = Math.min(45, 30);
        System.out.println(min);
        int max = Math.max(450, 300);
        System.out.println(max);
        double random = Math.random();
        System.out.println(random);
        int together = (int) Math.round(Math.random() * 100);
        System.out.println(together);
    }
}