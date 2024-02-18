/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeChecker;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

    void CheckPrime(int... num) {

        for (int i = 0; i < num.length; i++) {
            if (num[i] < 2) {

            } else {
                if (num[i] == 2) {
                    System.out.print(2 + " ");
                } else {
                    int bool = 1;
                    for (int j = 2; j < num[i]; j++) {
                        if (num[i] % j == 0) {
                            bool = 0;
                            break;
                        }
                    }
                    if (bool == 1) {
                        System.out.print(num[i] + " ");
                    }
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());

            Solution ob = new Solution();
            ob.CheckPrime(n1);
            ob.CheckPrime(n1, n2);
            ob.CheckPrime(n1, n2, n3);
            ob.CheckPrime(n1, n2, n3, n4, n5);
        } catch (Exception ex) {
        }
    }
}
