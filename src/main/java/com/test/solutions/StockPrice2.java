package com.test.solutions;

import java.lang.reflect.Array;
import java.util.*;

public class StockPrice2 {
    public int[] solution(int[] prices) {
        /***
         * 비교) 맨앞 값 < 나머지 값 중 맨앞값 보다 작은값,
         * 비교) 맨앞 값 > 나머지 값 중 맨앞값 보다 작은값,
         */
        int[] answer = new int[prices.length];
        for (int i=0 ; i<prices.length ; i++){
            for (int j=i+1; j<prices.length ; j++){
                   if (prices[i] > prices[j]){  // 작은건 체크
                       answer[i] = j-i;
                       break;
                   }else
                       answer[i] = j-i;
            }
        }

        return answer;
    }


    public static void main(String[] args){
        StockPrice2 T = new StockPrice2();
        System.out.println("return = " + T.solution(new int[]{1,2,3,2,3})  );
    }
}
