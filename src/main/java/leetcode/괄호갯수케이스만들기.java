package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class 괄호갯수케이스만들기 {

    public static void main(String[] args){
        괄호갯수케이스만들기 s = new 괄호갯수케이스만들기();

//        Parameter setting
        String p1 = "]";
        int p2 = 3;

        System.out.println("===================================");
        System.out.println(s.generateParenthesis(p2));
        System.out.println("===================================");
    }

    List<String> res = new ArrayList<>();

    List<String> generateParenthesis(int n){
//        1 = ()
//        2 = ()() (())
//        3 = ()()() (()()) (())() ()(()) ((()))
//        4 = ()()()() ()()(()) ()(())() (())()() ...

//        재귀로 돌려서 해야할듯?

        dfs(n, 0, 0, "");

        return res;
    }

    void dfs(int n, int open, int close, String s){
        // 전체 길이가 되면 넣고 종료
        if(s.length() == n*2) {
            res.add(s);
            return;
        }

        // 좌괄호 조건
        if(open<n) {
            dfs(n, open + 1, close, s + "(");
        }

        // 우괄호 조건
        if(close<open) {
            dfs(n, open, close + 1, s + ")");
        }
    }

}