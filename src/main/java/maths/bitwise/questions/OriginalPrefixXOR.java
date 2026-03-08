package maths.bitwise.questions;

import java.util.Arrays;

public class OriginalPrefixXOR {
    public static void main(String[] args) {
        int[] arr = {5,2,0,3,1};
        System.out.println(Arrays.toString(findArray(arr)));
    }

    public static int[] findArray(int[] pref) {
        for (int i = pref.length - 1; i > 0; i--) {
            pref[i] ^= pref[i - 1];
        }
        return pref;
    }
}
