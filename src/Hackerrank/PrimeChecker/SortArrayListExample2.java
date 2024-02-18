package PrimeChecker;

import java.util.*;

public class SortArrayListExample2 {

    public static void main(String args[]) {
//creating an object of ArrayList class  
        ArrayList<String> list = new ArrayList<String>();
        list.add("R");
        list.add("i");
        list.add("f");
        list.add("a");
//printing ArrayList before sorting  
        System.out.println("ArrayList Before Sorting:");
        for (String marks : list) {
            System.out.println(marks);
        }
//sorting ArrayList in ascending order  
        Collections.sort(list);
//printing ArrayList after sorting  
        System.out.println("ArrayList After Sorting:");
        for (String marks : list) {
            System.out.println(marks);
        }
    }
}
