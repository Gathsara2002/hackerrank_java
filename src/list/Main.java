package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 2/9/2026 -- 7:39 PM
 **/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            String command = scanner.next();
            if (command.equals("Insert")) {
                int val1 = scanner.nextInt();
                int val2 = scanner.nextInt();
                list.add(val1, val2);
            }
            if (command.equals("Delete")) {
                int val3 = scanner.nextInt();
                list.remove(val3);
            }
        }
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
