package stack;

import java.util.Stack;

public class Remove_Adjacent_Duplicates {


    public static void main(String[] args) {
        String str = "abccdeef";

        Stack<Character> stack = new Stack<Character>();

        for (char c : str.toCharArray()) {
            if(!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : stack){
            sb.append(c);
        }
        System.out.println(sb.toString()) ;
    }
}
