import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 // N = Long.parseLong(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int answer = 0;
		switch(n){
			case 0:
				answer = 1;
				break;
			case 1:
				answer = 1;
				break;
			case 2:
				answer = 2;
				break;
			case 3:
				answer = 6;
				break;
			case 4:
				answer = 6;
				break;
			case 5:
				answer = 3;
				break;
			case 6:
				answer = 9;
				break;
			case 7:
				answer = 9;
				break;
			case 8:
				answer = 9;
				break;
			case 9:
				answer = 9;
				break;
			case 10:
				answer = 9;
				break;
			default:
				answer = 9;
		}
		System.out.println(answer);
	}
}