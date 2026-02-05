package one_d_array;

import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 2/5/2026 -- 10:03 PM
 **/

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        scan.close();
    }
}
