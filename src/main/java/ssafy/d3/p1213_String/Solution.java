package main.java.ssafy.d3.p1213_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 10; i++) {
			int tc = Integer.parseInt(br.readLine());

			String search = br.readLine();
			String str = br.readLine();

			int cnt = 0;

			for (int j = 0; j <= str.length()-search.length(); j++) {
//				int count = 1;
				if(str.substring(j,j+1).equals(search.substring(0,1))){
					int count = 1;
					for (int k = 1; k < search.length(); k++) {
						if(str.substring(j+k, j+k+1).equals(search.substring(k,k+1))){
							count++;
						}else{
							break;
						}

					}

					if(count==search.length()){
						cnt++;
					}
				}

			}
			System.out.printf("#%d %d\n", tc, cnt);
		}
	}
}
