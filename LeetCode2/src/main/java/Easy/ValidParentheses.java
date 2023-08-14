package Easy;

import java.util.ArrayList;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "({}[])[]";
        System.out.println(isValid(s));;

    }

    static boolean isValid(String s) {
        ArrayList<String> stack = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '('){
                stack.add(String.valueOf(s.charAt(i)));
            }
            if(stack.isEmpty() &&
                    (s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']')){
                return false;
            }
            if(s.charAt(i) == '}') {
                if (stack.get(stack.size() - 1).equals("{")) {
                    stack.remove(stack.size() - 1);
                } else {
                    return false;
                }
            }
            if(s.charAt(i) == ')') {
                if (stack.get(stack.size() - 1).equals("(")) {
                    stack.remove(stack.size() - 1);
                } else {
                    return false;
                }
            }
            if(s.charAt(i) == ']') {
                if (stack.get(stack.size() - 1).equals("[")) {
                    stack.remove(stack.size() - 1);
                } else {
                    return false;
                }
            }
            if(!stack.isEmpty() && i == s.length() - 1){
                return false;
            }
        }
        return true;
    }
}
