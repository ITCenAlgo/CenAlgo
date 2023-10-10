package day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node {
	char x;
	Node left;
	Node right;
	
	Node(char x) {
		this.x = x;
	}
}

public class BOJ_1991_트리순회 {

	public static StringBuilder sb = new StringBuilder();
	public static Node node = null;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			char x = st.nextToken().charAt(0);
			char left = st.nextToken().charAt(0);
			char right = st.nextToken().charAt(0);
			
			createNode(x, left, right);
		}
		
		preorder(node);
		sb.append("\n");
		inorder(node);
		sb.append("\n");
		postorder(node);
		sb.append("\n");
		
		System.out.println(sb.toString());
	}
	
	public static void createNode(char x, char left, char right) {
		if(node == null) {
			node = new Node(x);
			node.left = new Node(left);
			node.right = new Node(right);
		}
		else {
			if(node.x == x) {
				node.left = new Node(left);
				node.right = new Node(right);
			}
			else
				searchNode(node, x, left, right);
		}
	}
	
	public static void searchNode(Node node, char x, char left, char right) {
		if(node == null) return;
		
		if(node.x == x) {
			node.left = new Node(left);
			node.right = new Node(right);
		}
		else {
			searchNode(node.left, x, left, right);
			searchNode(node.right, x, left, right);
		}
	}
	
	public static void preorder(Node node) {
		if(node == null) return;
		
		if(node.x != '.') sb.append(node.x);
		if(node.left != null) preorder(node.left);
		if(node.right != null) preorder(node.right);
	}
	
	public static void inorder(Node node) {
		if(node == null) return;
		
		if(node.left != null) inorder(node.left);
		if(node.x != '.') sb.append(node.x);
		if(node.right != null) inorder(node.right);
	}
	
	public static void postorder(Node node) {
		if(node == null) return;
		
		if(node.left != null) postorder(node.left);
		if(node.right != null) postorder(node.right);
		if(node.x != '.') sb.append(node.x);
	}
}
