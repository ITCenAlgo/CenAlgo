import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		// 출력을 위한 객체
		for (int i = 1; i <= N * M; i++) {												// 1 ~ N * M 반복
			bw.write(Integer.toString(i));													// 현재 숫자 출력
			if (i % M == 0) {																// M 의 배수이면
				bw.write("\n");																	// 개행 출력
			} else {																		// 아니면
				bw.write(" ");																	// 공백 출력
			}
		}
		sc.close();
		bw.close();
	}
}
