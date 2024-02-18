package JavaCurrencyFormatter;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        if (payment <= 1000000000 && payment >= 0) {
            String m = String.format("%.2f", payment);
            double dd = Double.parseDouble(m);

            NumberFormat usnf = NumberFormat.getInstance(Locale.US);
            String s = usnf.format(dd);
            Currency usc = Currency.getInstance(Locale.US);
            System.out.println("US: " + usc.getSymbol() + s);

            NumberFormat chinanf = NumberFormat.getInstance(Locale.CHINA);
            String sss = chinanf.format(dd);
            Currency chinac = Currency.getInstance(Locale.CHINA);
            System.out.println("China: " + chinac.getSymbol() + sss);

            NumberFormat nfr = NumberFormat.getInstance(Locale.FRANCE);
            String ssss = nfr.format(dd);
            Currency fr = Currency.getInstance(Locale.FRANCE);
            System.out.println("France: " + fr.getSymbol() + ssss);

        }

    }

}

abstract class test {

    static void printCurrency(double number, String s, Locale locale) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        String currency = formatter.format(number);
        System.out.println(s + currency);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        if (payment >= 0 && payment <= 1000000000) {
            printCurrency(payment, "US: ", Locale.US);
            printCurrency(payment, "India: ", new Locale("en", "in"));
            printCurrency(payment, "China: ", Locale.CHINA);
            printCurrency(payment, "France: ", Locale.FRANCE);
        }

        Calendar cl = Calendar.getInstance();
        cl.set(Calendar.MONTH, 11);
        cl.set(Calendar.DATE, 18);
        cl.set(Calendar.YEAR, 2000);
        Date day = cl.getTime();
        SimpleDateFormat formatd = new SimpleDateFormat("EEEE");
        String s = formatd.format(day).toUpperCase();
        System.out.println(s);

    }
}
