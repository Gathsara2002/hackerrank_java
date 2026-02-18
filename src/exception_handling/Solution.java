package exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 2/18/2026 -- 7:25 PM
 **/

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int result = x / y;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        }

        scanner.close();
    }
}
