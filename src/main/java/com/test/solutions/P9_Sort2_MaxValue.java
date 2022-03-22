package com.test.solutions;

import java.util.*;

public class P9_Sort2_MaxValue {

    /***
     *
     */
    public String solution(int[] numbers) {
        String answer = "";

        String[] sNumbers = new String[numbers.length];

        for (int i=0; i<numbers.length ; i++){
            sNumbers[i] = String.valueOf(numbers[i]);
        }

        // 문자 크기 비교시 Compare<String> 오버라이드 -> 람다식 변환 -> 글자 두개 합쳐서 큰 순으로 정렬
        Arrays.sort(sNumbers, (o1, o2) -> (o2+o1).compareTo(o1+o2));

        if (sNumbers[0].equals("0")) return "0";

        return String.join("", sNumbers);
    }


    public static void main(String[] args){
        P9_Sort2_MaxValue T = new P9_Sort2_MaxValue();

        int[] param1 = {6, 10, 2};  // return 6210
//        int[][] param2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println( T.solution( param1 ));
    }
}
