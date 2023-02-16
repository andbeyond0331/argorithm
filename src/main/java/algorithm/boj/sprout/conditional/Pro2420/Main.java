package main.java.algorithm.boj.sprout.conditional.Pro2420;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws  IOException{
		BufferedReader bufferedReader = new BufferedReader ( new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bufferedReader.readLine(), " ");
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		System.out.println(Math.abs(a-b));
	}
}
