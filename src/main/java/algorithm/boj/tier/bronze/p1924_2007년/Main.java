package main.java.algorithm.boj.tier.bronze.p1924_2007년;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

		int count = 0;
		for (int i = 0; i < x-1; i++) {
			count+=days[i];
		}
		count+=y;
		String result = "";
		if(count%7==0){
			result = day[day.length-1];
		}else{
			result = day[count%7-1];
		}
		System.out.println(result);
	}
}
