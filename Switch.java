/**
 * Switch
 */
public class Switch {

    public static void main(String[] args) {
        String role = "user";
        switch (role) {
            case "admin":
                System.out.println("Your role is admin");
                break;
            case "user":
            System.out.println("You are a user");
               break;
            default:
            System.out.println("Invalid login");
                break;
        }
    }
}