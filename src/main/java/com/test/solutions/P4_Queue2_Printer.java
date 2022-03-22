package com.test.solutions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P4_Queue2_Printer {
    public int solution(int[] priorities, int location) {
        priorities = new int[]{2, 1, 3, 2};
        location = 2;  // 0 일때, return 3

        int answer = 0;
        int l = location;

        Queue<Integer> que = new LinkedList<Integer>();
        for(int i : priorities){
            que.add(i);
        }

        Arrays.sort(priorities);
        int size = priorities.length-1;

//        TODO 이해하기
        while(!que.isEmpty()){
            Integer i = que.poll();
            if(i == priorities[size - answer]){
                answer++;
                l--;
                if(l <0)
                    break;
            }else{
                que.add(i);
                l--;
                if(l<0)
                    l=que.size()-1;
            }
        }

        return answer;
    }
}
