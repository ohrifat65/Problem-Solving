package JavaSubstringComparisons;

import java.util.Scanner;

public class JavaSubstringComparisons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int x = sc.nextInt();
            int length = s.length();

            int array2[] = new int[length];
            for (int i = 0; i < length; i++) {
                array2[i] = s.charAt(i);
            }
            int array[] = new int[length - x + 1];
            for (int i = 0; i < array.length; i++) {
                array[i] = s.charAt(i);
            }
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        int temp;
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

            int small = array[0];

            int large = array[array.length - 1];
            //searching index
            for (int i = 0; i < length; i++) {
                if (small == array2[i]) {
                    System.out.print(s.substring(i, i + x) + "\n");
                    break;
                }
            }
            for (int i = 0; i < length - x; i++) {
                if (large == array2[i]) {
                    System.out.print(s.substring(i, i + x) + "\n");
                    break;
                }
            }

        }
    }

