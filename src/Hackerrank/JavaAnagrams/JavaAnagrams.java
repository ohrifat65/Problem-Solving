package JavaAnagrams;

import java.util.Scanner;
/**
 *
 * @author wwe
 */
public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        int n = 9;
        if (a.length() == b.length()) {
            a.toUpperCase();
            b.toUpperCase();
            int x = 0;
            int y = 0;
            for (int i = 0; i < a.length() - 1; i++) {
                x = x + a.charAt(i);
                y = y + b.charAt(i);
                if (y == x) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int jv=10;
        int jv1=0110;
        System.out.println(jv);

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        boolean bool = isAnagram(a, b);
        System.out.println(bool);
        if (bool == true) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }

    }

}
