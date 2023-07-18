package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
/*
1. Set 자료구조를 활용해 맨 끝부터 번호 체크
2. 인원이 꽉차면 출력
 */
public class BOJ_1235_학생번호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        String[] arr = new String[N];
        for(int i=0;i<N;i++) {
            arr[i] = br.readLine();
        }

        for(int i=1;i<=arr[0].length();i++){

            for(int j=0;j<N;j++){
                set.add(arr[j].substring(arr[0].length()-i));
            }

            if(set.size()==N){
                System.out.println(i);
                return;
            }
            set.clear();
        }
    }
}
