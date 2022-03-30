package com.test.solutions;

public class P16_dfs3_WordChange {
    int answer = 0;
    boolean[] visited;

//    abc    adc
    public void dfs(String begin, String target, String[] words, int cnt){

        if (begin.equals(target)){
            answer = cnt;
            return;
        }

        for (int i=0;i<words.length;i++){
            if (visited[i]){
                continue;
            }
            int k=0;  // "hot", "dot", "dog", "lot", "log", "cog"
            for(int j=0;j<begin.length(); j++){
                if (begin.charAt(j) == words[i].charAt(j)) { // hit == hot
                    k++;
                }

                if (k == begin.length() - 1) {  // k=1 == len=2
                    visited[i] = true;
                    dfs(words[i], target, words, cnt + 1);
                    visited[i] = false;
                }
            }

        }
    }


    public int solution(String begin, String target, String[] words) {
        visited = new boolean[words.length];

        // 앞에서부터 단어를 잘라서 매칭되는거 찾아야됨
        dfs(begin, target, words, 0);

        return answer;
    }

    public static void main(String[] args){
        P16_dfs3_WordChange T = new P16_dfs3_WordChange();

        String[] param1 = {"hot", "dot", "dog", "lot", "log", "cog"};
        int[] param2 = {2,4};
        System.out.println( T.solution("hit","cog",param1));
    }
}
