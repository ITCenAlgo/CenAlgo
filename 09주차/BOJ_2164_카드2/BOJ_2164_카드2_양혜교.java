public class BOJ_2164_카드2_양혜교 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> T = new LinkedList<Integer>(); // 정수 객체를 담는 큐 선언

        for(int i=1; i<=N; i++){    // 큐 삽입
            T.add(i);
        }

        int pCard;

        while(T.size() > 1){
            T.poll();           //큐에서 첫번째 값 반환
            if(T.size()==1){
                break;
            }
            pCard = T.poll();
            T.add(pCard);
        }
        System.out.println(T.poll());

    }

}