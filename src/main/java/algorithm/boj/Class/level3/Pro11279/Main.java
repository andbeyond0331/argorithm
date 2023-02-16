package main.java.algorithm.boj.Class.level3.Pro11279;

//2022-08-26 최대 힙

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bufferedReader.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(bufferedReader.readLine());
			if(num==0){
				if(pq.isEmpty()){
					System.out.println(0);
				}else{
					System.out.println(pq.poll());
				}
			}else{
				pq.add(num);
			}
		}
	}
}
