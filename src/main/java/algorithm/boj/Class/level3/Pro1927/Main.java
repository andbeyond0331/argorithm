package main.java.algorithm.boj.Class.level3.Pro1927;

//2022-08-24 최소힙

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bufferedReader.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < N; i++) {
			int n = Integer.parseInt(bufferedReader.readLine());
			if(n==0){
				if(pq.isEmpty()){
					System.out.println(0);
				}else{
					System.out.println(pq.poll());
				}
			}else{
				pq.add(n);
			}
		}
	}
}
