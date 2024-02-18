package List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List L = new ArrayList();
        for (int i = 0; i < N; i++) {
            L.add(sc.nextInt());
        }
        int Q = sc.nextInt();
        for (int P = 0; P < Q / 2; P++) {
            if (N > L.size()) {

                String ins = sc.next();
                if (ins.equals("Insert")) {
                    int i = sc.nextInt();
                    int j = sc.nextInt();
                    L.add(i, j);
                }
                String del = sc.next();
                if (del.equals("Delete")) {
                    int k = sc.nextInt();
                    L.remove(k);
                }

                for (int r = 0; r < L.size(); r++) {
                    System.out.print(L.get(r) + " ");
                }
            } else {
                System.out.println("Insert{-truncated-}");
                break;
            }

        }

    }

}

class Solution2 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());
            int A[] = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = Integer.parseInt(br.readLine());
                
            }
            for (int i = 0; i < A.length; i++) {
                System.out.println(A[i]);
            }
        } catch (IOException e) {
        }

    }
}
