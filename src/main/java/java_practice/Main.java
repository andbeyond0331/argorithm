package main.java.java_practice;

import java.util.ArrayList;
import java.util.List;

public class Main {

	static String species;
	public static void main(String[] args) {
		System.out.printf("%-2f", 12345678.12345678);
		System.out.println();
		System.out.printf("%.2f", 12345678.5678);
		System.out.println();
		System.out.printf("%2f", 12345.12);

		System.out.println("----------");
		// 자료형
		// 논리형: boolean
		// 문자형: char
		// 정수형: byte, short, int(기본값), long
		// 실수형: float, double(기본값)
		// -> 근사값, 부정확하다. 유효숫자로 표현. 값 손실 있을 수 있음. 범위는 넓음
		// double은 형변환으로 이사갈 수 있는 가장 넓은 집

		// 논리형: true/false 두 값 중 하나
		boolean b = true;

		// 문자형
		char c = 'A'; // 홑따옴표 사용

		// 정수형

		byte b2 = (byte) 129;
		System.out.println(b2);

		// byte의 범위는 : -128~127 -> 양수, 음수 각각 128가지 양수는 0이 포함되어 있어서 127까지임
		// 8bit에서 맨 앞은 부호역할(0 1)
		// 넘어가면, 한 바퀴 돌아서 뒤에서 첫번째

		int i = 1234567890;
		System.out.println(i);
		float f = i;
		System.out.println(f); // float의 유효숫자: 6-7
		int i2 = (int)f;
		System.out.println(i2);

		long l = 123456789012L;
		System.out.println(l);
		float f2 = l;
		System.out.println(f2); // 1.23456788E10
		long l2 = (long) f2; // 범위가 큰 집 -> 작은 집 (명시적 형변환)
		System.out.println(l2); // 12345678848 -> float은 정확하지 않다!!!

		float f3 = 10.1f; // 기본적으로 실수는 double이므로 f
		double d = 10.1;
		System.out.println(f3);
		System.out.println(d);

		// 0.1이다 아니다? 실수의 부정확성 실수를 사용할 때는 조심하자
		float f4 = 0.3f - 0.2f;
		System.out.println(f4); // -> 0.10000001
		double d2 = 0.3 - 0.2;
		System.out.println(d2);// -> 0.09999999999999998

		// 정수의 묵시적 형변환: 작은집 -> 큰집
		int i3 = 1;
		long l3 = i3;

		// 정수의 명시적 형변환: 큰집 -> 작은집
		long l4 = 12345678901L;
		int i4 = (int) l4;
		System.out.println(i4);

//		int a = 123456789012345;
//		System.out.println();

//		byte num1 = 10000;

		List<Integer> list = new ArrayList<>();
//		System.out.println(list instanceof );

	}
}
