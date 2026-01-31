package palindrome_string;

import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 1/31/2026 -- 8:18 PM
 **/

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String reversedString = new StringBuilder(A).reverse().toString();

        if(A.equals(reversedString)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
