package Java_Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author wwe
 */
public class NewClass {

    private int ID;
    private String Name;
    private double CGPA;

    NewClass(int ID, String Name, double CGPA) {
        this.ID = ID;
        this.Name = Name;
        this.CGPA = CGPA;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add("Rifat");

        for (int i = 0; i < n; i++) {

            NewClass ob = new NewClass(sc.nextInt(), sc.next(), sc.nextDouble());

        }

    }
}
