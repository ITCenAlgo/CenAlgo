import java.io.*;
import java.util.*;

class Main {
    static Map<Character, Character[]> tree;
    static StringBuffer pre = new StringBuffer();
    static StringBuffer ino = new StringBuffer();
    static StringBuffer post = new StringBuffer();

    static void trav(char p) {
        pre.append(p);                                                  // 루트먼저 => 전위 순회
        if (tree.get(p)[0] != '.') trav(tree.get(p)[0]);                // 왼쪽 자식 탐색
        ino.append(p);                                                  // 왼쪽 자식 탐색 후 루트 => 중위 순회
        if (tree.get(p)[1] != '.') trav(tree.get(p)[1]);                // 오른쪽 자식 탐색
        post.append(p);                                                 // 오른쪽 자식 탐색 후 루트 => 후위 순회
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        tree = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String[] temp = br.readLine().split(" ");
            char p = temp[0].charAt(0), r = temp[1].charAt(0), l = temp[2].charAt(0);       // tree를 map 형태로 저장
            if (!tree.containsKey(p)) tree.put(p, new Character[2]);                        // 부모 노드를 key
            tree.get(p)[0] = r;                                                             // 왼쪽 자식을 배열의 0번
            tree.get(p)[1] = l;                                                             // 오른쪽 자식을 1번 인덱스로 저장
        }
        trav('A');
        System.out.println(pre + "\n" + ino + "\n" + post);
    }
}
