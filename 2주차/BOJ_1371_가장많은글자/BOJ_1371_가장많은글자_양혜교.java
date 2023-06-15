public class BOJ_1371_가장많은글자_양혜교{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[26];        // 알파벳 배열 26 생성

        while (scan.hasNextLine()){             //  입력줄이 있으면 True를 반환(Boolean)
            String str = scan.nextLine();       // 한 줄을 가져옴
            for(char c : str.toCharArray()){
                if(Character.isLowerCase(c)){       // 공백 제거
                    arr[c - 'a']++;                 // 배열 카운트
                }
            }
        }

        int max = 0;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);            // 배열에서 가장 큰 수를 저장
        }

        for(int i=0; i<arr.length; i++){
            if(max == arr[i]){                      // 인덱스를 찾음
                System.out.print((char)('a' + i));      // 'a'가 97이므로, i(인덱스)를 더한 뒤 알바벳을 찾음
            }
        }

    }
}