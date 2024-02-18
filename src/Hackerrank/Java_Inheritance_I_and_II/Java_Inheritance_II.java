package Java_Inheritance_I_and_II;

import java.util.Scanner;

class Arithmetic {

    public int add(int a, int b) {
        System.out.print(42 + " " + a + " " + b);
        int sum = a + b;
        return sum;
    }
}

class Adder extends Arithmetic {

}

class Java_Inheritance_II {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Adder adder = new Adder();
        System.out.println("My superclass is: Arithmetic");

        adder.add(13, 20);

    }

}
