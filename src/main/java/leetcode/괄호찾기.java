package leetcode;

import java.util.Stack;

class 괄호찾기 {

    public static void main(String[] args){
        괄호찾기 s = new 괄호찾기();

//        Parameter setting
        String p1 = "]";

        System.out.println("===================================");
        System.out.println(s.isValid(p1));
        System.out.println("===================================");
    }

    public boolean isValid(String s) {
        System.out.println("parameter check : " + s);

        // 대칭 안맞으면 무조건 아님
        if(s.length() % 2 != 0)
            return false;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()){
            if( c== ')'&& !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else if( c== '}'&& !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else if( c== ']'&& !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }else{
                stack.push(c);
            }
        }

        return stack.isEmpty();

    } // end of function
}