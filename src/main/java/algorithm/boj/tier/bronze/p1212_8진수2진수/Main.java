package main.java.algorithm.boj.tier.bronze.p1212_8진수2진수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// 8진수 주어지고 2진수로 변환
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String pal = br.readLine();
		StringBuilder e = new StringBuilder("");

		if(pal.equals("0")) {
			System.out.print("0");
		}else{
			for (int i = 0; i < pal.length(); i++) {
				long tmp = Math.round(Math.pow(8, pal.length()-1-i));
				long ei = tmp * Integer.parseInt(pal.substring(i,i+1));
				long tmp1 = tmp*2;
				long tmp2 = tmp*4;

				String f = String.valueOf(ei/tmp2);
				ei %= tmp2;
				String s = String.valueOf(ei/tmp1);
				ei %= tmp1;
				String t = String.valueOf(ei/tmp);
				ei %= tmp;

				if(pal.substring(i,i+1).equals("0")) {
					e.append("000");
				}else{
					if(i==0) {
						if(f.equals("0") && s.equals("0")){
							e.append(t);
						}else if(f.equals("0")){
							e.append(s);
							e.append(t);
						}else{
							e.append(f);
							e.append(s);
							e.append(t);
						}
					}else{
						e.append(f);
						e.append(s);
						e.append(t);
					}

				}

			}

			System.out.print(e);
		}

		br.close();





	}
}
