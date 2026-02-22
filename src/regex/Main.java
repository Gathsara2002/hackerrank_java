package regex;

import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 2/22/2026 -- 2:39 PM
 **/

public class Main {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}

class UsernameValidator{
    public static final String regularExpression = "^[A-Za-z][A-Za-z0-9_]{7,29}$";
}
