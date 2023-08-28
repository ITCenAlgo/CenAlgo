package day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BOJ_1235_학생번호_이미지 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine()); // 학생 수

		// 학생번호 studentID list에 저장
		List<String> studentID = new ArrayList<>();
		for (int i = 0; i < N; i++)
			studentID.add(br.readLine());

		boolean isDuplicate; // 학생번호가 중복인지 체크
		Set<String> subS; // 학생번호를 마지막자리부터 잘라서 만든 set

		int lenID = studentID.get(0).length(); // 학생번호 길이
		for (int i = 1; i <= lenID; i++) { // i : 학생 번호를 서로 다르게 만들 수 있는 최소값
			subS = new HashSet<>(); //set은 중복을 허용하지 않으니까!!!
			isDuplicate = false;

			for (String s : studentID) {
				if (!subS.add(s.substring(s.length() - i))) { //학생번호를 마지막자리부터 i만큼 자른 문자열이 중복이면 break
					isDuplicate = true;
					break;
				}
			}

			if (isDuplicate)
				continue;
			else {
				System.out.println(i);
				break;
			}
		}
	}
}
