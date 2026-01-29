package static_block;

import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 1/29/2026 -- 7:24 PM
 **/

public class Main {

    // 1. Declare variables here as static so 'main' can use them
    static int B;
    static int H;
    static boolean flag = true;

    // 2. The static block runs once when the class loads
    static {
        Scanner scanner = new Scanner(System.in);

        // Read inputs (Do NOT print prompts like "Enter number")
        B = scanner.nextInt();
        H = scanner.nextInt();
        scanner.close();

        // 3. Validation Logic
        if (B <= 0 || H <= 0) {
            // The problem asks to print this specific string, not throw a crash
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false; // This tells the main method NOT to print the area
        }
    }

    // The main method is usually hidden/locked in this problem,
    // but this is what it looks like behind the scenes:
    public static void main(String[] args){
        if(flag){
            int area = B * H;
            System.out.print(area);
        }
    }
}
