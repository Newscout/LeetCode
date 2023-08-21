package Easy;

public class RemoveElement27 {

    // https://leetcode.com/problems/remove-element/

    public static void main(String[] args) {
        int[] a = {0,1,2,2,3,0,4,2};
        int b = 2;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println(removeElement(a, b));

    }
    static int removeElement(int[] nums, int val){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 999){
                break;
            }
            if(nums[i] != val){
                count += 1;
                continue;
            }
            for (int j = i; j < nums.length - 1; j++) {
                nums[j] = nums[j + 1];
            }
            nums[nums.length - 1] = 999;
            i -= 1;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        return count;
    }
}
