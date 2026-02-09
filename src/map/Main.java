package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 2/9/2026 -- 7:29 PM
 **/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        HashMap<String, Integer> phoneBook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            Integer number = phoneBook.get(s);
            if (number != null) {
                System.out.println(s + "=" + number);
            } else {
                System.out.println("Not Found");
            }
        }
        in.close();
    }
}
