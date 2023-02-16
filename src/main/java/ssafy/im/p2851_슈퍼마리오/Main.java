package main.java.ssafy.im.p2851_슈퍼마리오;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] mush = new int[10];
		for (int i = 0; i < 10; i++) {
			mush[i] = Integer.parseInt(br.readLine());
		}

		int score = 0;

		for (int i = 0; i < mush.length; i++) {
			if(i+1<mush.length && Math.abs(100-score-mush[i])>Math.abs(100-score-mush[i]-mush[i+1])) {
				score+=mush[i];
			}else if(i+1 < mush.length && Math.abs(100-score-mush[i])==Math.abs(100-score-mush[i]-mush[i+1])) {
				score+=mush[i]+mush[i+1];
				break;
			}else {
				if(Math.abs(100-score)>Math.abs(100-score-mush[i])){
					score+=mush[i];
				}else if(Math.abs(100-score)==Math.abs(100-score-mush[i])) {
					score+=mush[i];
					break;
				}else{
					break;
				}

			}
		}


		System.out.println(score);
	}
}

