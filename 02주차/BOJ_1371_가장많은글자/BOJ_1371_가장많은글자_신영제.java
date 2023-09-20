package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
0. 무한루프 도는거 같아서 인터넷 조금 참조
1. 알파벳 배열 생성
2. 해당 문자를 char형태로 받아 알파벳 배열 카운트
3. 가장큰 숫자를 max에 담는다.
4. max와 비교하여 일치하면 출력
 */

public class BOJ_1371_가장많은글자 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String story;

        int alphaCnt = 26;
        int max = 0;
        int[] alphabet = new int[alphaCnt];

        while ((story = br.readLine()) != null){

            for (int i=0; i < story.length(); i++){
                if (story.charAt(i) != ' ') {
                    alphabet[story.charAt(i)-'a']++;
                }
            }

        }

        for (int i=0; i < alphaCnt; i++) {
            max = Math.max(max, alphabet[i]);
        }

        for (int i=0; i < alphaCnt; i++){
            char solv = (char)(i+'a');
            if(alphabet[i] == max) System.out.print(solv);
        }
    }

}
