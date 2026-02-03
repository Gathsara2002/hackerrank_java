package prime_numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @author : Gathsara
 * created : 2/3/2026 -- 7:54 PM
 **/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();

        BigInteger bigInteger = new BigInteger(n);
        boolean probablePrime = bigInteger.isProbablePrime(100);
        if (probablePrime){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }

        bufferedReader.close();
    }
}
