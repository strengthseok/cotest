package com.test.solutions;

import java.util.Locale;
import java.util.Scanner;

class Solution {

    public String solution(String s){
        String answer = "";

        for (char x : s.toCharArray()){
            if (Character.isDigit(x)){
                answer += x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution T = new Solution();

        // 입력받기
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        char t = sc.next().charAt(0);

        String str = "0found7, time: study; Yduts; emit; 7Dnuof0";
        System.out.println(T.solution(str));
    }

}


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