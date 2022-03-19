package com.test.solutions;

import java.util.*;

class FunctionUpgrade2 {

    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();


        for (int i=0 ; i < progresses.length ; i++){
            int day = (int) Math.ceil( (100-progresses[i]) / (float)speeds[i]); // float 선언 안할시 이슈 발생

            if (!q.isEmpty() && q.peek() < day ){
                list.add(q.size());
                q.clear();
            }
            q.offer(day);
        }
        list.add(q.size());

        answer = new int[list.size()];
        for (int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }

        return answer;
    }


    public static void main(String[] args) {
        FunctionUpgrade2 T = new FunctionUpgrade2();

        System.out.println(T.solution(new int[]{93, 30, 55}, new int[]{1, 30, 5}));
    }

}

/***
 * 93 94 95 96 97 98 99 100
 * 30 60 90 100
 */




/***
 * for (char x : str.toCharArray()){  // 배열 for
 * // 입력받기
 * Scanner sc = new Scanner(System.in);
 *         String str = sc.next();
 *         String str = sc.nextLine();
 *         System.out.println(str);
 *         char t = sc.next().charAt(0);
 * t = Character.toUpperCase(t);  // char 변환
 * Character.isUpperCase(s) // 대소문자 구분
 * Character.isAlphabetic() // 알파벳 체크
 * Character.isDigit() // 숫자 체크
 * StringBulider().reverse()
 * str.indexOf(str.charAt(i)))==i // 문자 중복 제거
 * replaceAll("[^0-9]","") // 정규식으로 변환시켜버리기(not:^, 범위:0-9,A-Z)
 * 아스키 코드값 : (int)'a'
 */