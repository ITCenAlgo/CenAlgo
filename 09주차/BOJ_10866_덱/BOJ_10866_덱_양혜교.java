public class BOJ_10866_덱_양혜교 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String S = st.nextToken();

            switch (S) {
                case "push_front":
                    int a = Integer.parseInt(st.nextToken());
                    deque.addFirst(a);
                    break;

                case "push_back":
                    int b = Integer.parseInt(st.nextToken());
                    deque.addLast(b);
                    break;

                case "pop_front": {
                    sb.append(deque.isEmpty()?-1:deque.pop()).append('\n');
                    break;
                }
                case "pop_back": {
                    sb.append(deque.isEmpty()?-1:deque.removeLast()).append('\n');
                    break;
                }
                case "size": {
                    sb.append(deque.size()).append('\n');
                    break;
                }
                case "empty": {
                    sb.append(deque.isEmpty()?1:0).append('\n');
                    break;
                }
                case "front": {
                    sb.append(deque.isEmpty()?-1:deque.peek()).append('\n');
                    break;
                }
                case "back": {
                    sb.append(deque.isEmpty()?-1:deque.peekLast()).append('\n');
                    break;
                }
                default:
                    break;
            }
        }
        System.out.println(sb);
    }
}