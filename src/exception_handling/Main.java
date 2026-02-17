package exception_handling;

import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 2/17/2026 -- 7:40 PM
 **/

public class Main {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class MyCalculator {
    long power(int a, int b) throws Exception {
        if (a < 0 || b < 0) {
            throw new Exception("n or p should not be negative");
        }

        if (a == 0 && b == 0) {
            throw new Exception("n and p should not be zero");
        }

        return (long) Math.pow(a,b);
    }
}
