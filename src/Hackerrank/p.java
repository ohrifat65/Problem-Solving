
import java.util.Scanner;

class p {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n[] = new int[5];
        n[0] = sc.nextInt();
        n[1] = sc.nextInt();
        n[2] = sc.nextInt();
        n[3] = sc.nextInt();
        n[4] = sc.nextInt();
        String s = "";

        for (int i = 0; i < 5; i++) {
            for (int j = 2; j < n[i] - 1; j++) {
                if (n[i] % j == 0) {
                    break;
                } else {
                    
                    for (int k = 0; k < 4; k++) {
                        s = s + n[i];
                    System.out.print(s);
                    }
                    }
                System.out.println();

                    

            }
        }
    }
}








//    public void checkPrime(int n[]) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 2; j < n[i] - 1; j++) {
//                if (n[i] % j != 0) {
//                    System.out.println("");
//                }
//            }
//        }
//    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] n = new int[5];
//        n[0] = sc.nextInt();
//        n[1] = sc.nextInt();
//        n[2] = sc.nextInt();
//        n[3] = sc.nextInt();
//        n[4] = sc.nextInt();
//        new prime().checkPrime(n);
//        
//    }
//    
//}
class d {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int k=sc.nextInt();
//        
//        
//        for (int i = 0; i < k; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }System.out.println("");
//        }

}
