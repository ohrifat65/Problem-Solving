package Java2DArray;

import java.util.Random;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] A = new int[6][6];
        Random r = new Random(5);
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                A[i][j] = r.nextInt(2);
            }                           //1 1 1 0 0 0
        }                               //0 1 0 0 0 0
                                        //1 1 1 0 0 0
                                        //0 0 2 4 4 0
        for (int j = 0; j < 6; j++) {   //0 0 0 2 0 0
            for (int k = 0; k < 6; k++) {//0 0 1 2 4 0
                System.out.print(A[j][k] + "  ");
            }
            System.out.println("");
        }
        //search long
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if(A[i][j]>0){
                    
                }
            }
        }

    }
}
