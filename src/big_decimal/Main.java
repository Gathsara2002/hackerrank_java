package big_decimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 2/23/2026 -- 7:37 PM
 **/

public class Main {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        Arrays.sort(s, (a, b) -> {
            if (a == null && b == null) return 0;
            if (a == null) return 1;   // push nulls to the end
            if (b == null) return -1;

            return new BigDecimal(b).compareTo(new BigDecimal(a));
        });

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
