public class BOJ_11866_요세푸스문제0_양혜교 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < N; i++){
            queue.add(i+1);
        }

        System.out.print("<");
        while(queue.size() > 0){
            for (int i = 0; i < K-1; i++) {
                queue.add(queue.poll());
            }
            System.out.print(queue.poll());
            if (queue.size() > 0) {
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }


}