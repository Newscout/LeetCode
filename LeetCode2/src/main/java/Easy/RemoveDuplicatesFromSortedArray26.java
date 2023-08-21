package Easy;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray26 {
    public static void main(String[] args) {

        int [] arr = {6, 3, 7, 2, 7, 5 , 6, 8, 8, 9, 10, 3, 1};
//        int [] arr = {1, 1, 2};
//        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(newArray(arr));


    }
    static int newArray(int[] nums){
        Arrays.sort(nums);
        System.out.println();
        int [] nonDuplicateNums = new int[nums.length];
        nonDuplicateNums[0] = nums[0];
        int indexForAddElement = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]){
                nonDuplicateNums[indexForAddElement] = nums[i];
                indexForAddElement += 1;
            }
        }
        int count = 1;
        for (int i = 0; i < nonDuplicateNums.length; i++) {
            nums[i] = nonDuplicateNums[i];
            if(i != 0 && nonDuplicateNums[i] > nonDuplicateNums[i - 1]){
                count += 1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();


        return count;
    }
}
