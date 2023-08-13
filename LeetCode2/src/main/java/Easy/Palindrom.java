package Easy;

public class Palindrom {
    public static void main(String[] args) {
        int x = -12321;
        System.out.println(isPalindrome(x));


    }
    static boolean isPalindrome(int x) {
        boolean flag = false;
        String s = String.valueOf(x);
        String s2 = "";
        for(int i = s.length() - 1; i >= 0; i--){
            s2 += s.charAt(i);
        }
        if(s.compareTo(s2) == 0){
            flag = true;
        }
        return flag;
    }
}
