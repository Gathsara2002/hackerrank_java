package string_token;

import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 2/1/2026 -- 7:40 PM
 **/

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }
        String regex = "[\\s!,?._'@]+";
        String[] s1 = s.split(regex);
        System.out.println(s1.length);
        for (String string : s1) {
            System.out.println(string);
        }
        scan.close();
    }
}
