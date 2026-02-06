package subarray;

import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 2/6/2026 -- 8:23 PM
 **/

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);

        scanner.close();
    }
}
