package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 2/6/2026 -- 8:39 PM
 **/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Read the lines
        for (int i = 0; i < n; i++) {
            int k = sc.nextInt();
            ArrayList<Integer> inner = new ArrayList<>();

            for (int j = 0; j < k; j++) {
                inner.add(sc.nextInt());
            }
            list.add(inner);
        }

        int q = sc.nextInt(); // number of queries

        // Process queries
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            try {
                // Convert to 0-based index
                System.out.println(list.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}
