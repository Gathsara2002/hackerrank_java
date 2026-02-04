package big_integer;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 2/4/2026 -- 6:48 PM
 **/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();

        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

        scanner.close();
    }
}
