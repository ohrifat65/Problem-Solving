package JavaStringReverse;

import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String s = "";
        for (int i = A.length() - 1; i >= 0; i--) {
            s = s + A.substring(i, i + 1);
        }
        if (s.equals(A)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
