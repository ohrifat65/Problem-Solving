package EOF;

import java.util.*;

public class EOF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
//        while (sc.hasNext()) {
//            count++;
//            String s = sc.nextLine();
//            System.out.println(count + "" + s);
//        }
        int n = sc.nextInt();

        if (n <= 100 && n >= -100) {
            String.valueOf(n);
            count = 1;

        }
        if (count == 1) {
            System.out.println("Good job");

        } else {
            System.out.println("Wrong answer");
        }
    }

}
