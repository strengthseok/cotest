package com.test.solutions;

import java.util.LinkedList;
import java.util.Queue;

public class BridgeWeight2 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;
        Queue<Integer> q = new LinkedList<>();

        for (int i=0;i<truck_weights.length;i++){
            int truck = truck_weights[i];

            while(true) {
                if (q.isEmpty()) { // 다리위에 아무것도 없을떄 -> q에 값추가, 시간 추가, 종료
                    q.add(truck);
                    sum += truck;
                    answer++;
                    break;
                } else if (q.size() == bridge_length) { // 꽉찼을때 -> 큐하나 빼기, 시간추가안함(, 다시 실행
                    sum -= q.poll();
                } else {  // 다리위에 있긴할때 -> wight랑 비교해서 작을때는 집어넣고 종료, 아닐때는 그냥 증가하고 다시 실행
                    if (sum + truck > weight) {
                        q.add(0);
                        answer++;
                    } else {
                        q.add(truck);
                        sum += truck;
                        answer++;
                        break;
                    }
                }
            }

        }

        return answer+bridge_length; // 마지막 차도 지나가는 시간이 있어야됨
    }

    public static void main(String[] args){
        BridgeWeight2 T = new BridgeWeight2();
        System.out.println("return = " + T.solution(2, 10, new int[]{7, 4, 5, 6})  );
        System.out.println("return = " + T.solution(100, 100, new int[]{10})  );
        System.out.println("return = " + T.solution(100, 100, new int[]{10,10,10,10,10,10,10,10,10,10})  );
    }
}
