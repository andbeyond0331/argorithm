package main.java.algorithm.boj.tier.bronze.p1550_16진수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int n = 16;
		int idx = str.length()-1;
		long result = 0;
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
				case '0':
					result += 0;
					break;
				case '1' : case '2': case '3': case '4' : case '5' : case '6' : case '7' : case '8' : case '9' :
					result += Math.round(Math.pow(n, idx))*Integer.parseInt(String.valueOf(str.charAt(i)));
					break;
				case 'A' :
					result += Math.round(Math.pow(n, idx))*10;
					break;
				case 'B' :
					result += Math.round(Math.pow(n, idx))*11;
					break;
				case 'C' :
					result += Math.round(Math.pow(n, idx))*12;
					break;
				case 'D' :
					result += Math.round(Math.pow(n, idx))*13;
					break;
				case 'E' :
					result += Math.round(Math.pow(n, idx))*14;
					break;
				case 'F' :


					result += Math.round(Math.pow(n, idx))*15;
					break;
				default:
					System.out.println("Something's Wrong!!!!");

			}

//			System.out.println("str.charAt("+i+"): " + str.charAt(i));
//			System.out.println("Math.round(Math.pow(n, idx))*10 = " + Math.round(Math.pow(n, idx))*10);
//			System.out.println("i = " + i);
			idx--;

		}
		System.out.println(result);

	}

}
