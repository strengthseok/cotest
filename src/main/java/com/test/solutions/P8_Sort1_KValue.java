package com.test.solutions;

import java.util.*;

public class P8_Sort1_KValue {

    /***
     * 배열내에서 x,y값까지 잘라서 z번째 값 찾아서 넣기
     * @param array
     * @param commands
     * @return
     */
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i=0;i<commands.length ; i++){

            List<Integer> res = new ArrayList<>();
            // 자르기
            for (int j=commands[i][0]-1 ; j < commands[i][1] ; j++){
                res.add(array[j]);
            }

            // 정렬
            Collections.sort(res);

            // 뽑기
            int val = commands[i][2]-1;
            answer[i] = res.get(val);
        }

        /* TODO 비교해보기
        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        */

        return answer;
    }


    public static void main(String[] args){
        P8_Sort1_KValue T = new P8_Sort1_KValue();

        int[] param1 = {1, 5, 2, 6, 3, 7, 4};
        int[][] param2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println("return = " + T.solution( param1, param2 ));
    }
}
