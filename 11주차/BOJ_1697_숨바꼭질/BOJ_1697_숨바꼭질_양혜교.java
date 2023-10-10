public class BOJ_1697_숨바꼭질_양혜교 {

    static int N;
    static int K;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        K = scan.nextInt();

        if(N==K){
            System.out.println(0);
        } else {
            bfs(N);
        }
    }

    static int[] check = new int[100001];

    static void bfs(int N) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(N);
        check[N] = 1;

        while(!queue.isEmpty()){
            int temp = queue.poll();        //큐의 첫번째 요소를 삭제(및 반환)

            for(int i=0; i<3; i++){
                int next;

                if(i==0){
                    next = temp + 1;
                }else if(i == 1){
                    next = temp - 1;
                }else{
                    next = temp * 2;
                }

                if(next == K){
                    System.out.println(check[temp]);
                    return;
                }

                if(next >=0 && next < check.length && check[next] == 0){
                    queue.add(next);
                    check[next] = check[temp]+1;
                }

            }
        }
    }

}