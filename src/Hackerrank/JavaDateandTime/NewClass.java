package JavaDateandTime;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int start = sc.nextInt();
        int end = sc.nextInt();

        if (start >= 0 && end < s.length() + 1) {
            String sub = s.substring(start, end);
            System.out.print(sub);
        }

    }
}
