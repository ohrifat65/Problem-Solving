package formatSpecifiew;

import java.util.Scanner;

public class FormatSpecifier {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 32; i++) {
            System.out.print("=");
        }
        System.out.println("");
        for (int l = 0; l < 3; l++) {
            String s = sc.next();
            int i = sc.nextInt();

            if (s.length() < 11 && i < 1000) {
                System.out.printf(s);
                int k = 15 - s.length();
                for (int j = 0; j < k; j++) {
                    System.out.print(" ");
                }
                if (i < 10) {
                    System.out.printf("00" + i);
                } else if (i < 100) {
                    System.out.printf("0" + i);
                } else if (i < 1000) {

                    System.out.printf(String.valueOf(i));
                }
                System.out.println("");
            }

        }
        for (int i = 0; i < 32; i++) {
            System.out.print("=");
        }
    }

}

//class Solution {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("================================");
//        for (int i = 0; i < 3; i++) {
//            String s1 = sc.next();
//            int x = sc.nextInt();
//            System.out.printf("%-15s%03d%n", s1, x);
//        }
//        System.out.println("================================");
//
//    }
//}
