package JavaSubstringComparisons;

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        java.util.List<String> a = new java.util.ArrayList<>();

        for (int i = 0; i < s.length() - k + 1; i++) {
            a.add(s.substring(i, i + k));
            System.out.println(a);
        }
        System.out.println(a.get(0));
        java.util.Collections.sort(a);
        smallest = a.get(0);
        largest = a.get(a.size() - 1);
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        sc.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
