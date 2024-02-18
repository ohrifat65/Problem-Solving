package JavaStringsIntroduction;

import java.util.Scanner;

/**
 *
 * @author wwe
 */
public class solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();
        int x = A.length();
        int y = B.length();
        int sum = x + y;
        System.out.println(String.valueOf(sum));
        int a = A.charAt(0);
        int b = B.charAt(0);
        if (a <= b) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        String s1 = A.substring(0, 1).toUpperCase();
        String s2 = B.substring(0, 1).toUpperCase();
        System.out.println(s1 + A.substring(1, A.length()) + " " + s2 + B.substring(1, B.length()));

    }
}
