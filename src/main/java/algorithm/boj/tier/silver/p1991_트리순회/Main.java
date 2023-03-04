package main.java.algorithm.boj.tier.silver.p1991_트리순회;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	static String preorder;
	static String inorder;
	static String postorder;
	static Map<Character, char[]> tree = new TreeMap<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		preorder = "";
		inorder = "";
		postorder = "";

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			char[] tmp = new char[2];
			char node = st.nextToken().charAt(0);
			char l = st.nextToken().charAt(0);
			char r = st.nextToken().charAt(0);

			tmp[0] = l;
			tmp[1] = r;
			tree.put(node, tmp);
		}

		pre('A');
		sb.append(preorder);
		sb.append("\n");


		bw.append(sb);
		bw.flush();
		br.close();
		bw.close();

	}

	static void pre(Character node){
		preorder += node;
		if(tree.get(node)[0]=='.'){
			if(tree.get(node)[1] == '.'){
				return;
			}else{

				pre(tree.get(node)[1]);
			}
		}else {
			pre(tree.get(node)[0]);
			if (tree.get(node)[1] == '.') {
				return;
			} else {
				pre(tree.get(node)[1]);
			}
		}
	}

	static void in(Character node){
		if(tree.get(node)[0] != '.'){
			inorder+=tree.get(node)[0];
			in(tree.get(node)[0]);
		}
		inorder+=node;
		if(tree.get(node)[1] != '.'){

		}

	}

	static void post(){

	}
}
