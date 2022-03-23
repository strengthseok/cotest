package com.test.solutions;

import java.util.*;

public class P11_AllSearch1_exam {

    /***
     *
     */
    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        int answer1=0, answer2=0, answer3=0;


        // 문제맞힌 갯수찾기
        for (int i=0; i < answers.length ; i++){
            if (answers[i] == a[i%a.length]) answer1++;
            if (answers[i] == b[i%b.length]) answer2++;
            if (answers[i] == c[i%c.length]) answer3++;
        }

        int max = Math.max(Math.max(answer1,answer2),answer3);

        ArrayList<Integer> list = new ArrayList<>();
        if (max == answer1 ) list.add(1);
        if (max == answer2 ) list.add(2);
        if (max == answer3 ) list.add(3);

        answer = new int[list.size()];
        for (int i=0; i<answer.length ; i++){
            answer[i] = list.get(i);
        }

        return answer;
//        TODO Collection 비교해보기 .
//         return list.stream().mapToInt(i->i.intValue()).toArray();
    }


    public static void main(String[] args){
        P11_AllSearch1_exam T = new P11_AllSearch1_exam();

        int[] param1 = {1,3,2,4,2};  // return 1
//        int[][] param2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println( T.solution( param1 ));
    }
}
