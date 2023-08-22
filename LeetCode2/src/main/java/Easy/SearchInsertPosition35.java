package Easy;

public class SearchInsertPosition35 {

    //https://leetcode.com/problems/search-insert-position/

    public static void main(String[] args) {
        int[] n = {1,3,4,5,6};
        int t = 7;
        System.out.println(searchInsert(n, t));


        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }

    //https://leetcode.com/problems/search-insert-position/
    static int searchInsert(int[] nums, int target) {
        int index = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= target){
                index = i;
                break;
            }
        }
        return index;
    }
//    https://leetcode.com/problems/length-of-last-word/
    static int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        return s1[s1.length - 1].length();
    }






}
