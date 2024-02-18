
import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = {2, 1, 3,4,5};
        String s = "";
        int k = 0;
        for (int i = 0; i < 5; i++) {                   

            for (int j = 2; j < n[i] - 1; j++) {
                if (n[i] == 2 || n[i] % j != 0) {
                    s = s + n[i];
                    k++;
                } System.out.println(s);
                if (k == 4) {
                    break;
                } break;

            }

        }

    }
    }

