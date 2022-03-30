package com.test.solutions;

import java.util.HashSet;

public class P12_AllSearch2_SearchPrimeNumber {

    HashSet<Integer> hashSet = new HashSet<>();
    int answer = 0;

    //    재귀를 통해 조합을 만든다
    public void recursive(String comb, String others){  // re("", "123")

        if (!comb.equals("")) {
            hashSet.add(Integer.valueOf(comb));
        }

        for (int i=0 ; i < others.length() ; i++){
            recursive(comb + others.charAt(i) , others.substring(0, i) + others.substring(i+1));
        }
    }

    //    소수 확인
    public boolean prime(int comb){
        if (comb == 1 || comb == 0)
            return false;

        int limit = (int) Math.sqrt(comb);
        for (int i=2; i<limit ; i++){
            if (comb%i==0)
                return false;
        }

        return true;

    }

    public int solution(String numbers) {
        // 숫자 조합 가져오기 + 소수 판별
        recursive("", numbers);

//        TODO 해쉬셋가지고 돌아가면서 소수 찾아서 증가

        return answer;
    }


    public static void main(String[] args){
        P12_AllSearch2_SearchPrimeNumber T = new P12_AllSearch2_SearchPrimeNumber();

        int[] param1 = {1,3,2,4,2};  // return 1
//        int[][] param2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println( T.solution( "011" ));
    }
}
