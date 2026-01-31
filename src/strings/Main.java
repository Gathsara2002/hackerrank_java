package strings;

import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 1/31/2026 -- 7:30 PM
 **/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int sum = A.length() + B.length();
        int i = A.compareTo(B);
        String isLex;
        if (i > 0) {
            isLex = "Yes";
        } else {
            isLex = "No";
        }

        String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capB = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(sum);
        System.out.println(isLex);
        System.out.println(capA + " " + capB);
    }
}
