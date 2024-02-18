package JavaSubstringComparisons;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author wwe
 */
public class NewClass {

    String j = "helloworldjava";
//    ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfh sdlkfhsdlfhsLFDLSFHSDLFHsdkfhs
//    dkfhsdkfhsdfhsdfjeaDFHSDLFHD FlajfsdlfhsdlfhDSLFHSDLFHdlfhs
//ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs
    public static String getSmall_Large(String s, int k) {
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < s.length() - k + 1; i++) {
            list.add(s.substring(i, i + k));
        }
        Collections.sort(list);

        String smallest = list.get(0);
        String largest = list.get(list.size() - 1);
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String m = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(getSmall_Large(m, n));
    }
}
