package main.java.algorithm.boj.tier.silver.p1260_DFS와BFS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static boolean[] visited;
	static List<Integer>[] graph;
	static StringBuilder dfsSB = new StringBuilder();
	static StringBuilder bfsSB = new StringBuilder();
	static Queue<Integer> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());

		graph = new ArrayList[N+1];
		visited = new boolean[N+1];
//		System.out.println(graph[0]);

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a= Integer.parseInt(st.nextToken());
			int b= Integer.parseInt(st.nextToken());
			if(graph[a]==null){
				List<Integer> list = new ArrayList<>();
				list.add(b);
				if(graph[b]==null){
					List<Integer> lst = new ArrayList<>();
					lst.add(a);
					graph[b] = lst;
				}else{
					if(!graph[b].contains(a)){

						graph[b].add(a);
					}

				}
				graph[a] = list;
			}else{
				if(!graph[a].contains(b)){

					graph[a].add(b);
				}
				if(graph[b]==null){
					List<Integer> lst = new ArrayList<>();
					lst.add(a);
					graph[b] = lst;
				}else{
					if(!graph[b].contains(a)){

						graph[b].add(a);
					}

				}
			}
		}
		for (int i = 0; i < graph.length; i++) {
			if(graph[i]!=null){

				graph[i].sort(Comparator.naturalOrder());
			}
		}
		dfs(V);
		visited = new boolean[N+1];
		bfs(V);

		sb.append(dfsSB);
		sb.append("\n");
		sb.append(bfsSB);
		bw.append(sb);
		bw.flush();
		br.close();
		bw.close();

	}

	static void dfs(int n){
		visited[n] = true;
		dfsSB.append(n).append(" ");
		if(graph[n]!=null){
			for(int num : graph[n]){
				if(visited[num]==false){
					dfs(num);
				}
			}
		}

	}

	static void bfs(int n){
		if(graph[n]!=null){
			for(int num: graph[n]){
				visited[num] = false;
			}
		}

		visited[n] = true;
		bfsSB.append(n).append(" ");
		q.add(n);
		while(!q.isEmpty()){
			int tmp = q.poll();
			if(graph[tmp]!=null){
				for(int num: graph[tmp]){
					if(visited[num] == false){
						visited[num] = true;
						bfsSB.append(num).append(" ");
						q.add(num);
					}
				}
			}

		}
	}
}
