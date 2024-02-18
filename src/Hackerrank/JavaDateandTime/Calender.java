package JavaDateandTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

class Calender {

    public static void main(String[] args) {
        Calendar cln = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        int mm = sc.nextInt();
        int dd = sc.nextInt();
        int yyyy = sc.nextInt();
        cln.set(Calendar.DATE, dd);

        cln.set(Calendar.MONTH, mm - 1);

        cln.set(Calendar.YEAR, yyyy);

        Date d = cln.getTime();

        String Day = new SimpleDateFormat("EEEE").format(d);
        System.out.println(Day.toUpperCase());
    }
}

class damo {

    public static void main(String[] args) {
        new damo().display();

    }

    void display() {

        Scanner sc = new Scanner(System.in);
        int dd, mm, yyyy;

        dd = sc.nextInt();
        mm = sc.nextInt();
        yyyy = sc.nextInt();

        Calendar c = Calendar.getInstance();
        Date date = new Date();
        c.set(Calendar.DATE, dd);
        c.set(Calendar.MONTH, mm - 1);
        c.set(Calendar.YEAR, yyyy);
        Date day = c.getTime();
        String format = new SimpleDateFormat("EEEE").format(day).toUpperCase();
        System.out.println(format);

    }

}
