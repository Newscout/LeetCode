package Easy;

import java.util.ArrayList;

public class TwoSum {
    public static void main(String[] args) {
        int[] i = { 2,7,11,15 };
        int targ = 9;
        for(int b = 0; b < twoSumArray(i, targ).length; b++){
            System.out.print(twoSumArray(i, targ)[b] + " ");
        }



    }
    static int[] twoSumArray(int[] nums, int target) {
        int [] a = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++){
                if(i == j) continue;
                if(nums[i] + nums[j] == target){
                    a[0] = nums[i];
                    a[1] = nums[j];
                    break;
                }
            }
        }
        return a;

    }
}
