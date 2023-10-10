public class BOJ_2630_색종이만들기_양혜교 {
        static int white=0;
        static int blue=0;
        static int arr[][];
        public static void main(String args[]){
            Scanner scan = new Scanner(System.in);
            int N=scan.nextInt();

            arr=new int[N][N];

            for(int i=0;i<N;i++){
                for(int j=0;j<N;j++){
                    arr[i][j]=scan.nextInt();
                }
            }
            solv(0, 0, N);

            System.out.println(white);
            System.out.println(blue);
        }

        public static void solv(int row, int col, int size) {
            if(colorCheck(row, col, size)) {
                if(arr[row][col] == 0) {
                    white++;
                }
                else {
                    blue++;
                }
                return;
            }

            int newSize = size / 2;

            solv(row, col, newSize);
            solv(row, col + newSize, newSize);
            solv(row + newSize, col, newSize);
            solv(row + newSize, col + newSize, newSize);
        }


        public static boolean colorCheck(int row, int col, int size) {

            int color = arr[row][col];

            for(int i = row; i < row + size; i++) {
                for(int j = col; j < col + size; j++) {
                    if(arr[i][j] != color) {
                        return false;
                    }
                }
            }
            return true;
        }
    }