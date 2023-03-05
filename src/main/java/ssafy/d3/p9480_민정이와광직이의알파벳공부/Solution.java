package main.java.ssafy.d3.p9480_민정이와광직이의알파벳공부;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {
	static int cnt;
	static List<Character> alpha;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int tc = Integer.parseInt(br.readLine());

		for (int t = 1; t <= tc ; t++) {
			int N = Integer.parseInt(br.readLine()); // 아기 민정이가 아는 단어의 개수

			cnt = 0;

			String[] words = new String[N];
			boolean[] visited = new boolean[N];

			for (int i = 0; i < N; i++) {
				words[i] = br.readLine();
			}

			for (int i = 1; i <= N; i++) {
				setting(words, visited, 0, N, i);
			}

			sb.append("#").append(t).append(" ").append(cnt).append("\n");

		}

		bw.append(sb);
		bw.flush();
		br.close();
		bw.close();

	}

	static void setting(String[] words, boolean[] visited, int start, int n, int r){
		if( r == 0 ){
			alpha = new ArrayList<>();
			for (int i = 0; i < 26; i++) {
				alpha.add((char) (i+97));
			}
//			System.out.println("Arrays.toString(alpha) = " + Arrays.toString(alpha.toArray()));
			if(confirm(words, visited, n)){

				cnt++;
			}
			return;
		}

		for (int i = start; i < n; i++) {
			visited[i] = true;
			setting(words, visited, i + 1, n, r - 1);
			visited[i] = false;
		}
	}

	static boolean confirm(String[] words, boolean[] visited, int n){
		for (int i = 0; i < n; i++) {
			if(visited[i]){
				String word = words[i];
				for (int j = 0; j < word.length(); j++) {
					if(alpha.contains(word.charAt(j))){
						alpha.remove(alpha.indexOf(word.charAt(j)));
					}
				}

			}
		}
		if(alpha.isEmpty()){
			return true;
		}
		return false;
	}
}
