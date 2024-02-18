package JavaDateandTime;

import java.util.*;

public class Solution {

    String date;

    public static void main(String[] args) {
        Solution s = new Solution();
        s.getDay();
    }

    public void getDay() {
        Scanner sc = new Scanner(System.in);
        int mm = sc.nextInt();
        int dd = sc.nextInt();
        int yyyy = sc.nextInt();
        System.out.println(findDay(mm, dd, yyyy));
    }

    public String findDay(int month, int day, int year) {
        if (year >= 2000 && year <= 3000) {
            Date d = new Date(year, month - 1, day);
            int dd = d.getDay();

            switch (dd) {
                case 0:
                    date = "SATURDAY";
                    break;
                case 1:
                    date = "SUNDAY";
                    break;
                case 2:
                    date = "MONDAY";
                    break;
                case 3:
                    date = "TUESDAY";
                    break;
                case 4:
                    date = "WEDNESDAY";
                    break;
                case 5:
                    date = "THURSDAY";
                    break;
                case 6:
                    date = "FRIDAY";
                    break;
                default:
                    break;
            }
        }
        return date;

    }
}
