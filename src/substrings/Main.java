package substrings;

import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 1/31/2026 -- 7:42 PM
 **/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        String substring = S.substring(start, end);
        System.out.println(substring);
    }
}
