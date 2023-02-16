package main.java.ssafy.im.p2810_컵홀더;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String seats = br.readLine();

		int count = 1;

		for (int i = 0; i < N; i++) {
			if (seats.substring(i, i + 1).equals("S")) {
				count++;
			} else {
				count++;
				i++;
			}
		}

		if(count>=N) {
			count=N;
		}

		System.out.println(count);
	}
}
