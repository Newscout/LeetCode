package Easy;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{)";
        System.out.println(isValid(s));;

    }

    static boolean isValid(String s) {
        boolean flag = true;
        for(int i = 0; i < s.length(); i = i + 2){
            if(s.charAt(i) == '('){
                if(s.charAt(i + 1) != ')'){
                    flag = false;
                    break;
                }
            }
            if(s.charAt(i) == '['){
                if(s.charAt(i + 1) != ']'){
                    flag = false;
                    break;
                }
            }
            if(s.charAt(i) == '{'){
                if(s.charAt(i + 1) != '}'){
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
