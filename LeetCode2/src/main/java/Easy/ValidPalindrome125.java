package Easy;

//https://leetcode.com/problems/valid-palindrome/

import java.sql.SQLOutput;
import java.util.Locale;

public class ValidPalindrome125 {

    public static void main(String[] args) {
//        String s = "A man, a plan, a canal: Panam";
        String s = "0P";
        System.out.println(isPalindrome(s));

    }
    static boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        System.out.println(s1);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z'
                    || s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
                sb.append(s1.charAt(i));
            }
        }
        StringBuilder sb2 = new StringBuilder(sb);
        sb2.reverse();
        if (sb.compareTo(sb2) == 0) {
            return true;
        }
        return false;
    }
}
