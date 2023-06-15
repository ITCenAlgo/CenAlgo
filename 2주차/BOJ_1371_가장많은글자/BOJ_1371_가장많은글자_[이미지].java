import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //문자열 입력받아서 알파벳 개수 count
        String s;
        int[] cntArr = new int[26];
        while ((s = br.readLine()) != null) { //BufferedReader : 줄 단위로 읽다가 stream의 끝에서 null 값 반환
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != ' ') //공백이 아닌 경우에만 count
                    cntArr[s.charAt(i) - 'a']++;
            }
        }
        
        //가장 많은 알파벳 개수 찾기
        int max = 0;
        for (int i = 0; i < cntArr.length; i++) {
            if(max < cntArr[i])
                max = cntArr[i];
        }
        
        //max 개수의 알파벳들 순서대로 출력
        for (int i = 0; i < cntArr.length; i++) {
            if (cntArr[i] == max)
                System.out.print((char)(i + 'a'));
        }
    }
}
