/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

import java.io.*;
import java.util.*;
import java.util.*;

public class Solution {

    void PrintArray(List<?> list) {
        for (Object i : list) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        List<Integer> l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);

        List<String> m = new ArrayList();
        m.add("Hello");
        m.add("World");

        Solution g = new Solution();
        g.PrintArray((ArrayList) l);
        g.PrintArray((ArrayList) m);
    }
}
