public class BOJ_2508_사탕박사고창영_양혜교 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            int result = 0;
            br.readLine();
            StringTokenizer str = new StringTokenizer(br.readLine());

            int r = Integer.parseInt(str.nextToken());
            int c = Integer.parseInt(str.nextToken());

            char[][] arr = new char[r][c];

            for(int a = 0; a < r; a++) {
                String one = br.readLine();
                for(int b = 0; b < c; b++) {
                    arr[a][b] = one.charAt(b);
                }
            }

            for(int a = 0; a < r; a++) {
                for(int b = 0; b < c; b++) {
                    if(b < c-2 && arr[a][b] == '>' && arr[a][b+1] == 'o' && arr[a][b+2] == '<') {
                        result++;
                    }
                    if(a < r-2 && arr[a][b] == 'v' && arr[a+1][b] == 'o' && arr[a+2][b] == '^') {
                        result++;
                    }
                }
            }
            System.out.println(result);
        }

    }
}