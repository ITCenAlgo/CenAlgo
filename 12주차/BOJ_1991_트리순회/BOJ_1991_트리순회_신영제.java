package src.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
1. Node 클래스를 만들어 좌, 우구별 하게 해준다.
2. 전위, 중위, 후위에 맞게 함수를 호출하여 출력.
 */
class Node{

    char left;
    char right;

    public Node(char left, char right){
        this.left = left;
        this.right = right;
    }
}
public class BOJ_1991_트리순회 {

    static int N;
    static ArrayList<Node> node[];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        N = Integer.parseInt(br.readLine());

        node = new ArrayList[N];
        for(int i=0; i<N; i++){
            node[i] = new ArrayList<>();
        }

        for(int i=0; i <N; i++){
            st = new StringTokenizer(br.readLine());
            char start = st.nextToken().charAt(0);
            char left = st.nextToken().charAt(0);
            char right = st.nextToken().charAt(0);

            node[start - 'A'].add(new Node(left, right));
        }

        preorder(0);
        System.out.println();
        inorder(0);
        System.out.println();
        postorder(0);

    }

    private static void postorder(int start) {

        ArrayList<Node> nodeList = node[start];
        for(int i=0; i<nodeList.size(); i++){

            Node n = nodeList.get(i);

            char left = n.left;
            char right = n.right;

            if (left != '.')  postorder(left - 'A');
            if (right != '.') postorder(right - 'A');

            System.out.print((char)(start + 'A'));
        }


    }

    private static void inorder(int start) {
        ArrayList<Node> nodeList = node[start];
        for(int i=0; i<nodeList.size(); i++){

            Node n = nodeList.get(i);

            char left = n.left;
            char right = n.right;

            if (left != '.')  inorder(left - 'A');
            System.out.print((char)(start + 'A'));
            if (right != '.') inorder(right - 'A');

        }
    }

    private static void preorder(int start) {
        ArrayList<Node> nodeList = node[start];
        for(int i=0; i<nodeList.size(); i++){

            Node n = nodeList.get(i);
            char left = n.left;
            char right = n.right;

            System.out.print((char)(start + 'A'));
            if (left != '.')  preorder(left - 'A');
            if (right != '.') preorder(right - 'A');

        }
    }
}
