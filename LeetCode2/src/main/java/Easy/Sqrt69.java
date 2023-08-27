package Easy;

import java.sql.SQLOutput;

public class Sqrt69 {
    public static void main(String[] args) {
        int a = 1452314634;
        System.out.println(mySqrt(a));
    }

    static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        long result = -1;
        int length = String.valueOf(x).length();
        int count;
        if (length % 2 == 0) {
            count = length / 2;
        } else {
            count = length / 2 + 1;
        }
        int count2 = 10;
        long left = 1;
        for (int i = 0; i < count; i++) {
            if(i == 0){
                continue;
            }
            left *= count2;
        }
        long right = left * 10;
        while (result == -1){
            long middle = (right - left) / 2 + left;
            if (middle * middle > x) {
                if((middle - 1) * (middle - 1) < x){
                    result = middle - 1;
                }
                right = middle;
            } else if (middle * middle < x) {
                if((middle + 1) * (middle + 1) > x){
                    result = middle;
                }
                left = middle;
            } else {
                result = middle;
            }
        }
        return (int)result;
    }
}
