package main.java.algorithm.boj.sprout.print.Pro2744;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String word = bufferedReader.readLine();
		for (int i = 0; i < word.length(); i++) {
			if(97 <= word.charAt(i) && word.charAt(i) <= 122){
				word = word.substring(0,i)+word.substring(i,i+1).toUpperCase()+word.substring(i+1,word.length());
			}else{
				word = word.substring(0,i)+word.substring(i,i+1).toLowerCase()+word.substring(i+1,word.length());
			}
		}
		System.out.println(word);
	}
}
