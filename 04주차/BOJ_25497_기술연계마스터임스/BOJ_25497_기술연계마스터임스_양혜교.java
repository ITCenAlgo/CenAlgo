public class BOJ_25497_기술연계마스터임스_양혜교 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();

        int result = 0, Lc =0, Sc=0;

        for (int i = 0; i < N; i++) {

            if(arr[i] >= '1' && arr[i] <= '9'){
                result++;
            }else if(arr[i] == 'L'){
                Lc++;
            }else if(arr[i] == 'S'){
                Sc++;
            }else if((arr[i] == 'R' && Lc == 0) || (arr[i] == 'K' && Sc == 0)){
                break;
            }else if((arr[i] == 'R' && Lc > 0) || (arr[i] == 'K' && Sc > 0)){
                if(arr[i] == 'R') Lc--;
                if(arr[i] == 'K') Sc--;

                result++;
            }
        }
        System.out.println(result);
    }
}