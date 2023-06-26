import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2869_달팽이는올라가고싶다_이미지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int A = Integer.parseInt(st.nextToken()); //낮에 올라가는 높이
		int B = Integer.parseInt(st.nextToken()); //밤에 미끄러지는 높이
		int V = Integer.parseInt(st.nextToken()); //나무 높이

		int day = (V - A) / (A - B); //달팽이가 정상 도달하기 하루 전
		if ((V - A) % (A - B) == 0) //마지막날 A만큼만 올라가면 되니까 +1
			System.out.println(day + 1);
		else //A + α만큼 더 올라가야 하니까 +2
			System.out.println(day + 2);
	}
}