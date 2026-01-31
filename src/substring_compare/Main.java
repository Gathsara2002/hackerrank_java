package substring_compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 1/31/2026 -- 7:46 PM
 **/

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i <= s.length() - k; i++) {
            list.add(s.substring(i, k + i));
        }
        Collections.sort(list);
        smallest = list.getFirst();
        largest = list.getLast();
        return smallest + "\n" + largest;
    }
}
