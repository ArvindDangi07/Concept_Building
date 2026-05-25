package stack;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {

        String str = "((()))";
        Stack<Character> stack = new Stack<>();

        boolean valid = true;

        for(char c : str.toCharArray()){

            if(c=='('){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    valid = false;
                    break;
                }
                stack.pop();
            }


        }
        if(!stack.isEmpty()){
            valid = false;

        }
        System.out.println(valid);
    }
}
