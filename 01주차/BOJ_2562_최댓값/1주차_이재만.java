import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxNum = 0;							// 최대값 저장할 변수
		int maxOrd = 0;							// 몇 번째 수인지 저장할 변수
		for (int i = 1; i < 10; i ++) {			// 9번 반복
			int num = sc.nextInt();					// 자연수 입력
			if (maxNum < num) {						// 입력받은 자연수가 최대값보다 크면
				maxNum = num;							// 최대값을 새로 갱신
				maxOrd = i;								// 순서도 현재 순서로 갱신
			}
		}
		System.out.println(maxNum);				// 출력
		System.out.println(maxOrd);
		sc.close();
	}
}
