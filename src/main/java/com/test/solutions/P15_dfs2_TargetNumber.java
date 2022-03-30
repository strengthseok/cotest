package com.test.solutions;

import java.util.Arrays;

public class P15_dfs2_TargetNumber {
    int answer = 0;

    public void dfs(int[] numbers, int target, int depth, int sum){

        if (depth == numbers.length){
            if (sum == target){
                answer++;
            }
        }else {
            dfs(numbers, target, depth + 1, sum + numbers[depth]);
            dfs(numbers, target, depth + 1, sum - numbers[depth]);
        }

    }

    public int solution(int[] numbers, int target) {

        dfs(numbers, target, 0, 0);

        return answer;
    }

    public static void main(String[] args){
        P15_dfs2_TargetNumber T = new P15_dfs2_TargetNumber();

        int[] param1 = {1, 1, 1, 1, 1};
        int[] param2 = {2,4};
        System.out.println( T.solution(param1, 3));
    }
}
