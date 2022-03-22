package com.test.solutions;

import java.util.Arrays;

public class P10_Sort2_HIndex {

    /***
     * TODO 문제를 다시 읽어보기. 이해 잘안됨
     */
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for (int i=0;i<citations.length;i++){
            int h = citations.length - i; // 논문개수?

            if(citations[i] >= h){
                answer = h;
                break;
            }

        }



        return answer;
    }


    public static void main(String[] args){
        P10_Sort2_HIndex T = new P10_Sort2_HIndex();

        int[] param1 = {3, 0, 6, 1, 5};  // return 6210
//        int[][] param2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println( T.solution( param1 ));
    }
}
