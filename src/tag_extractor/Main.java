package tag_extractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author : Gathsara
 * created : 3/1/2026 -- 7:31 PM
 **/

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();

            Pattern pattern = Pattern.compile("<([^<>]+)>([^<>]+)</\\1>");
            Matcher matcher = pattern.matcher(line);
            boolean found = false;
            while (matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }
            if (!found) {
                System.out.println("None");
            }

            testCases--;
        }
    }
}
