package com.test.solutions;

import java.util.PriorityQueue;

public class P5_Heap2_TheSpicy {
    /***
     * 섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
     *
     * 스코빌 지수가 1인 음식과 2인 음식을 섞으면 음식의 스코빌 지수가 아래와 같이 됩니다.
     * 새로운 음식의 스코빌 지수 = 1 + (2 * 2) = 5
     * 가진 음식의 스코빌 지수 = [5, 3, 9, 10, 12]
     *
     * 스코빌 지수가 3인 음식과 5인 음식을 섞으면 음식의 스코빌 지수가 아래와 같이 됩니다.
     * 새로운 음식의 스코빌 지수 = 3 + (5 * 2) = 13
     * 가진 음식의 스코빌 지수 = [13, 9, 10, 12]
     *
     * @param scoville
     * @param K
     * @return
     */
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> heap = new PriorityQueue(); // 우선순위 큐 사용안하면 효율성 체크 먹음

        // 데이터넣기
        for (int s : scoville)
            heap.offer(s);

        // 쭉쭉 가져와서 하나씩 비교하고 다시 집어넣기
        while (heap.peek() <= K){
            if (heap.size() == 1)
                return -1;

            int x = heap.poll();
            int y = heap.poll();

            heap.offer(x + (y*2));
            answer++;
        }

        return answer;
    }



    public static void main(String[] args){
        P5_Heap2_TheSpicy T = new P5_Heap2_TheSpicy();
        System.out.println("return = " + T.solution(new int[]{1, 2, 3, 9, 10, 12}, 7)  );
    }
}
