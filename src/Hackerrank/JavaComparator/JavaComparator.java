package JavaComparator;

import java.util.ArrayList;
import java.util.List;

public class JavaComparator<Rifat> {

    List d = new ArrayList();

    void print(List<? extends Number> i) {
        for (Number o : i) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        JavaComparator c = new JavaComparator();
        List<Number> lst = new ArrayList();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        c.print(lst);
    }
}
