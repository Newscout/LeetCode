package Easy;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray26 {
    public static void main(String[] args) {

//        int [] arr = {6, 3, 7, 2, 7, 5 , 6, 8, 8, 9, 10, 3, 1};
        int [] arr = {1, 1, 2};
//        int [] arr = {0,0,1,1,1,2,2,3,3,4};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(newArray(arr));


    }
    static int newArray(int[] nums){
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != list.get(list.size() - 1)){
                list.add(nums[i]);
            }
        }
        int [] newNums = new int[list.size()];
        for (int i = 0; i < newNums.length; i++) {
            newNums[i] = list.get(i);
        }
        nums = newNums;
        return nums.length;
    }
}
