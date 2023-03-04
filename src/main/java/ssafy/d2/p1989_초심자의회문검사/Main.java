package main.java.ssafy.d2.p1989_초심자의회문검사;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int i = 1; i <= T ; i++) {
			String str = br.readLine();
//			System.out.println("str: " + str);
//			System.out.println("str.length()/2 = " + str.length()/2);
			int count = 0;
			for (int j = 0; j < str.length()/2; j++) {
				if(str.substring(j, j+1).equals(str.substring(str.length()-1-j, str.length()-j))){
					count++;
				}else{
					break;
				}

			}
			if(count==str.length()/2){
				System.out.printf("#%d %d\n", i, 1);
			}else{
				System.out.printf("#%d %d\n", i, 0);
			}
		}

	}
}
