package com.test.solutions;

import java.util.Arrays;
import java.util.PriorityQueue;

public class P6_Heap3_DiskContoller {

    /***
     * 하드 디스크 문제
     * 시작,종료 배열 받아서
     * 결과값은 9 나와야됨
     * @param jobs
     * @return
     */
    // TODO 문제 다시 한번 찬찬히 확인해보기
    public int solution(int[][] jobs) {
        //시작 시간 빠른 순 정렬
        Arrays.sort(jobs,(x,y)->(x[0]-y[0]));
        //실행시간 적은 순 정렬
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((x,y)->(x[1]-y[1]));
        //시간, 인덱스, 답 초기화
        int time =0, idx=0, answer=0;
        //인덱스가 범위내에 있거나, pq가 비어있지 않다면 while진행
        while(idx<jobs.length||!pq.isEmpty()) {
            //인덱스가 범위내에 있고, 시작시간이 시간 이내라면 pq에 집어넣기
            while(idx<jobs.length&&jobs[idx][0]<=time) {
                pq.add(jobs[idx++]);
            }
            //pq가 비어있다면 (시간 이내에 시작하는 task가 없다면)
            if(pq.isEmpty()) {
                //해당 시작 시간을 time으로 지정
                time=jobs[idx][0];
                continue;
            }
            //pq가 비어있지 않다면
            //시간에 pq에 들어간 작은 수행시간을 더함
            int[] job = pq.poll();
            time+=job[1];
            //종료 시간 - 시작시간
            answer += time-job[0];
        }
        //평균시간이므로 jobs의 길이로 나눠줌
        return answer/jobs.length;
    }



    public static void main(String[] args){
        P6_Heap3_DiskContoller T = new P6_Heap3_DiskContoller();
        System.out.println("return = " + T.solution(      new int[][]{{0, 3}, {1, 9}, {2, 6}}    ));
    }
}
