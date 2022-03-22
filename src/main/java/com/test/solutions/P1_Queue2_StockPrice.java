package com.test.solutions;

public class P1_Queue2_StockPrice {
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
        P1_Queue2_StockPrice T = new P1_Queue2_StockPrice();
        System.out.println("return = " + T.solution(new int[]{1,2,3,2,3})  );
    }
}
