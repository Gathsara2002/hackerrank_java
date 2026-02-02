package syntax_checker;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author : Gathsara
 * created : 2/2/2026 -- 7:46 PM
 **/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            try {
                Pattern compile = Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}
