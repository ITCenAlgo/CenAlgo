import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		List<Integer> list = new ArrayList<Integer>();
		int sumOfTwo = 0;
		
		//빠져야 하는 난쟁이들 합 구하기
		for (int i = 0; i < 9; i++) {
			list.add(Integer.parseInt(br.readLine()));
			sumOfTwo += list.get(i);
		}
		sumOfTwo -= 100;
	
		List<Integer> sortedList = new ArrayList<Integer>(list); //정렬된 list를 담기 위한 객체
		Collections.sort(sortedList);

		int idx1, idx2;
		for (int i = 0; i < list.size(); i++) {
			for (int j = list.size()-1; j > i; j--) { //가장 큰 수부터 비교
				if(sortedList.get(i) + sortedList.get(j) < sumOfTwo) //sumOfTwo보다 작으면 나머지 확인 안하고 break
					break;
				
				if(sortedList.get(i) + sortedList.get(j) == sumOfTwo) { // 두 난쟁이 찾았으면,
					idx1 = list.indexOf(sortedList.get(i)); //list에서 난쟁이1의 index
          				idx2 = list.indexOf(sortedList.get(j)); //list에서 난쟁이2의 index
					list.set(idx1, -1); //난쟁이1
					list.set(idx2, -1); //난쟁이2

					//일곱난쟁이들 출력
					for(Integer num : list) { 
						if(num > 0)
							System.out.println(num);
          				}
                    
					return;
				}
			}
		}
	}
}
