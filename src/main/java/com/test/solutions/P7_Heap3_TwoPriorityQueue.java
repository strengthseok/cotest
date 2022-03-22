package com.test.solutions;

import java.util.*;

public class P7_Heap3_TwoPriorityQueue {

    /***
     * @param
     * @return [0,0]
     */
    public int[] solution(String[] operations) {
        int[] answer = new int[2];

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pqr = new PriorityQueue<>(Collections.reverseOrder());

        for (String s : operations){
            StringTokenizer st = new StringTokenizer(s);
            String op = st.nextToken();
            int val = Integer.valueOf(st.nextToken());

            System.out.println(op + "/" + val);

            // 없을때 넘어가기
            if (pq.size() < 1 && op.equals("D")){
                continue;
            }

            // 하나씩 둘다 넣음
            if (op.equals("I")){
                pq.offer(val);
                pqr.offer(val);
                continue;
            }

            // 조건이 -1 or 1
            if (val < 0){
                int min = pq.poll();
                pqr.remove(min);
                continue;
            }

                int max = pqr.poll();
                pq.remove(max);


        }

        if(pq.size() > 0){
            answer[0] = pqr.poll();
            answer[1] = pq.poll();
        }

        System.out.println(answer[0] + "/" + answer[1]);
        return answer;
    }



    public static void main(String[] args){
        P7_Heap3_TwoPriorityQueue T = new P7_Heap3_TwoPriorityQueue();
        System.out.println("return = " + T.solution(new String[]{"I 16", "I -5643", "D -1", "D 1", "I 1", "I 123", "D -1"}));
    }
}
