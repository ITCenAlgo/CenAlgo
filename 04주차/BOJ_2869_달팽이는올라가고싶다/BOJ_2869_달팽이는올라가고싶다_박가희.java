package week04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ_2869_달팽이는올라가고싶다3 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] snail = new int[3];
		for(int i=0; i<snail.length; i++) {
			snail[i] = Integer.parseInt(st.nextToken());
		}
		
				// (나무막대 길이 - 미끄러진 길이) / (올라간 길이 - 미끄러진 길이)
				//				= 최종 목적지 / 하루에 움직이는 거리 -> 나눠 떨어진다면 미끄러지기 전에 도착 했다는 뜻
		int day = (snail[2] - snail[1]) / (snail[0] - snail[1]);
		
			// 나눠 떨어지지 않은 경우에는 하루를 더 추가로 가야한다는 뜻이기 때문에 +1
		if((snail[2] - snail[1]) % (snail[0] - snail[1]) != 0) {
			day++;
		}
		bw.write(String.valueOf(day));
		bw.flush();
		bw.close();
	}
}
