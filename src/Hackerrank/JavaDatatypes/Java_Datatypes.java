package JavaDatatypes;

import java.util.Scanner;

public class Java_Datatypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long T;

        for (int i = 0; i < n; i++) {
            try {
            T = sc.nextLong();

                if (T >= -128 && T <= 127) {
                    System.out.println(T + " can be fitted in:");
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (T >= -32768 && T <= 32767) {
                    System.out.println(T + " can be fitted in:");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (T >= -2147483648 && T <= 2147483647) {
                    System.out.println(T + " can be fitted in:");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (T >= -9223372036854775808L && T <= 9223372036854775807L) {
                    System.out.println(T + " can be fitted in:");
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }

        sc.close();
    }
}
