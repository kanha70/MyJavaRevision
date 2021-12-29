package Logic;

import java.util.Stack;

public class BalanceBracket {
    static String isBalance(String s){

        Stack<Character> stack = new Stack ();
        for (int i = 0; i< s.length(); i++){
            if (s.charAt(i) == '('  || s.charAt(i) == '{' || s.charAt(i) == '[' ){
                stack.push(s.charAt(i));
            }else {
                if (stack.isEmpty()){
                    return "NO";
                } else {
                    char pop_val = stack.pop();
                    if (s.charAt(i) == ')'  && pop_val != '(' ){
                        return "NO";
                    }
                    if (s.charAt(i) == '}'  && pop_val != '{' ){
                        return "NO";
                    }if (s.charAt(i) == ']'  && pop_val != '[' ){
                        return "NO";
                    }
                }
            }
        }
        if (stack.isEmpty()){
            return "YES";
        }else {
            return "NO";
        }
    }
}
