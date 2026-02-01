package anagram;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 2/1/2026 -- 6:57 PM
 **/

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {
        if (a.length() == b.length()) {
            String upperCase1 = a.toUpperCase();
            String upperCase2 = b.toUpperCase();

            char[] charArray1 = upperCase1.toCharArray();
            char[] charArray2 = upperCase2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            int compare = Arrays.compare(charArray1, charArray2);
            return compare == 0;
        }
        return false;
    }
}
