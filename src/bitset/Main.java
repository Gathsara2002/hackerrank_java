package bitset;

import java.util.Scanner;
import java.util.BitSet;

/**
 * @author : Gathsara
 * created : 2/24/2026 -- 8:32 PM
 **/

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);

        for (int i = 0; i < M; i++) {
            String operation = scanner.next();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            switch (operation) {
                case "AND":
                    if (x == 1) B1.and(B2);
                    else B2.and(B1);
                    break;

                case "OR":
                    if (x == 1) B1.or(B2);
                    else B2.or(B1);
                    break;

                case "XOR":
                    if (x == 1) B1.xor(B2);
                    else B2.xor(B1);
                    break;

                case "FLIP":
                    if (x == 1) B1.flip(y);
                    else B2.flip(y);
                    break;

                case "SET":
                    if (x == 1) B1.set(y);
                    else B2.set(y);
                    break;
            }
            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }

        scanner.close();
    }
}
