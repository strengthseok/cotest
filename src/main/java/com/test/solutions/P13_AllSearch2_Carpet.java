package com.test.solutions;

public class P13_AllSearch2_Carpet {


    // TODO 사각형 구하기 공식 확인
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int w=0; // 가로
        int h=0; // 세로

        for (h=3 ; h <= (int)(brown+4)/2; h++){

            w = ((brown+4)/2) - h;
            if (w < h)
                break;

            int yellowCount = (w -2) * (h - 2);
            if( yellow == yellowCount){
                break;
            }
        }

        answer[0] = w;
        answer[1] = h;

        System.out.println(answer[0] + "/" + answer[1]);
        return answer;
    }

    public static void main(String[] args){
        P13_AllSearch2_Carpet T = new P13_AllSearch2_Carpet();

        int[] param1 = {1,3,2,4,2};  // return 1
//        int[][] param2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println( T.solution( 10, 2 ));
    }
}
