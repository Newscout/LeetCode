package Easy;

// https://leetcode.com/problems/add-binary/

public class AddBinary67 {
    public static void main(String[] args) {
        String a = "1010";
        String b = "110";
        System.out.println("2 = " + addBinary2(a, b));
        System.out.println("1 = " + addBinary(a, b));
    }
    static String addBinary2(String a, String b){
        int diff = a.length() - b.length();
        if(diff < 0){
            for (int i = 0; i < Math.abs(diff);i++)
                a = "0" + a;
        }else if(diff > 0){
            for (int i = 0; i < Math.abs(diff);i++)
                b = "0" + b;
        }
        String result = "";
        char temp = '0';
        for (int i = b.length() - 1; i >= 0; i--) {
            if(temp == '0' && b.charAt(i) == a.charAt(i) && b.charAt(i) == '0'){
                result = "0" + result;
            }else if(temp == '0' && b.charAt(i) == a.charAt(i) && b.charAt(i) == '1' ){
                result = "0" + result;
                temp = '1';
            }else if(temp == '0' && b.charAt(i) != a.charAt(i)){
                result = "1" + result;
            }else if(temp == '1' && b.charAt(i) == a.charAt(i) && b.charAt(i) == '0'){
                result = "1" + result;
                temp = '0';
            }else if (temp == '1' && b.charAt(i) == a.charAt(i) && b.charAt(i) == '1'){
                result = "1" + result;
                temp = '1';
            }else if(temp == '1' && b.charAt(i) != a.charAt(i)){
                result = "0" + result;
                temp = '1';
            }
            if(i == 0 && temp == '1'){
                result = "1" + result;
            }
        }
        return result;
    }

    static String addBinary(String a, String b) {
        long aInt = 0;
        long bInt = 0;
        String result = "";

        for (int i = 0; i < a.length(); i++) {
            aInt += Character.digit(a.charAt(i), 10) * Math.pow(2, a.length() - 1 - i);
        }
        for (int i = 0; i < b.length(); i++) {
            bInt += Character.digit(b.charAt(i), 10) * Math.pow(2, b.length() - 1 - i);
        }
        long sum = aInt + bInt;
        boolean flag = true;
        while (flag){
            flag = false;
            result = sum % 2 + result;
            sum = sum / 2;
            if(sum > 1){
                flag = true;
            }
            if(sum == 1){
                result = sum + result;
            }
        }
        return result;
    }
}
