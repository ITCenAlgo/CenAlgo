public class BOJ_1235_학생번호_양혜교 {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());

        String[] arr = new String[N];

        for(int i = 0; i < N; i++){
            arr[i] = in.readLine();
        }

        HashSet<String> set = new HashSet<String>();    // 중복 제거

        for(int i=1; i<=arr[0].length(); i++){
            for(int j=0; j<N; j++){
                set.add(arr[j].substring(arr[j].length() - i));
            }

            if(set.size() == N){
                System.out.println(i);
                return;
            }
            set.clear();
        }

    }
}