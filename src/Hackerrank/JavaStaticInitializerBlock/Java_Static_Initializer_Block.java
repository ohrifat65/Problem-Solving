package JavaStaticInitializerBlock;

import java.util.Scanner;

public class Java_Static_Initializer_Block {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Java_Static_Initializer_Block().display();
    }
    public static int B, H, result;

    static {
        B = sc.nextInt();
        H = sc.nextInt();

    }

    void display() {
        if (B > 0 && H > 0) {
            result = B * H;
            System.out.println(result);

        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

}
