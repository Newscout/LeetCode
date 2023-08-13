package Easy;

import java.util.ArrayList;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] s = {"flower","flow","flowable"};
        System.out.println(longestCommonPrefix(s));


    }
    static String longestCommonPrefix(String[] strs) {
        String s2 = "";
        String shortestWord = strs[0];
        int indexShortestWord = 0;
        for (int i = 1; i < strs.length; i++) {
            if(strs[i].length() < shortestWord.length()){
                shortestWord = strs[i];
                indexShortestWord = i;
            }
        }
        for (int i = 0; i < shortestWord.length(); i++) {
            char c = shortestWord.charAt(i);
            boolean flag = true;
            for (int j = 0; j < strs.length; j++) {
                if(j == indexShortestWord){
                    continue;
                }
                if(c != strs[j].charAt(i)){
                    flag = false;
                }
            }
            if(flag){
                s2 += c;
            }else{
               break;
            }
        }
        return s2;

    }
}
