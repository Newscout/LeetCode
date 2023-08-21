package Easy;

public class FindTheIndexOfTheFirstOccurrenceInString28 {

    //    https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));

    }
    static int strStr(String haystack, String needle) {
        int index = -1;
        for (int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0)
                    && haystack.startsWith(needle, i)){
                index = i;
                break;
            }
        }
        return index;
    }
}
