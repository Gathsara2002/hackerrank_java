package currency_formatter;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author : Gathsara
 * created : 1/30/2026 -- 7:30 PM
 **/

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        scanner.close();

        NumberFormat currencyInstance1 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat currencyInstance2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat currencyInstance3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat currencyInstance4 = NumberFormat.getCurrencyInstance(indiaLocale);
        DecimalFormat decimalFormat = (DecimalFormat) currencyInstance4;
        DecimalFormatSymbols symbols = decimalFormat.getDecimalFormatSymbols();
        symbols.setCurrencySymbol("Rs.");
        decimalFormat.setDecimalFormatSymbols(symbols);

        String us = currencyInstance1.format(amount);
        String china = currencyInstance2.format(amount);
        String french = currencyInstance3.format(amount);
        String india = currencyInstance4.format(amount);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + french);
    }
}
