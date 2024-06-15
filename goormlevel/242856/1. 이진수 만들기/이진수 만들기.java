import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		// int N = Integer.parseInt(input, 2);
		input = Integer.toBinaryString(Integer.parseInt(input));
		System.out.println(input);
	}
}