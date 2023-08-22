package Easy;
import java.util.Arrays;

public class PlusOne66 {

    //https://leetcode.com/problems/plus-one/

    public static void main(String[] args) {
//        int [] array = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        int [] array = {9, 9, 9, 9, 9};
//        int [] array = {9, 9, 7, 9, 9};
//        int [] array = {0};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(plusOne(array)));
    }
        static int[] plusOne(int[] digits) {
        int counterOFNine = 0;
        for (int i = 0; i < digits.length; i++) {
            if(digits[i] == 9){
                counterOFNine += 1;
            }
        }
        if(counterOFNine == digits.length){
            int [] result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 1; i < result.length; i++) {
                result[i] = 0;
            }
            return result;
        }
        for (int i = digits.length - 1; i >= 0; i--) {
            if(digits[i] == 9){
                digits[i] = 0;
                continue;
            }
            if(digits[i] != 9){
                digits[i] += 1;
                break;
            }
        }
        return digits;
        }
}
