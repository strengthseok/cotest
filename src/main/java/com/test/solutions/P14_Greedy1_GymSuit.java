package com.test.solutions;

import java.util.Arrays;

public class P14_Greedy1_GymSuit {


    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;  // 전체 옷

        Arrays.sort(lost);
        Arrays.sort(reserve);


        // 가져온놈이 잃어버리면 못준다 -> 제거해버리기
        for (int i=0;i<lost.length;i++){
            for (int j=0;j<reserve.length;j++){
                if (lost[i] == reserve[j]){
                    answer++;
                    reserve[j] = -1;
                    lost[i] = -1;
                    break;
                }
            }
        }

        // 여벌 가져온사람 -> 앞이나 뒤에 준다
        for (int l : lost){
            for (int i=0 ; i < reserve.length ; i++){
                if ( l == reserve[i]-1 || l == reserve[i]+1 ){
                    answer += 1;
                    reserve[i] = -1;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        P14_Greedy1_GymSuit T = new P14_Greedy1_GymSuit();

        int[] param1 = {2,4};
        int[] param2 = {2,4};
        System.out.println( T.solution(5,param1,param2));
    }
}
