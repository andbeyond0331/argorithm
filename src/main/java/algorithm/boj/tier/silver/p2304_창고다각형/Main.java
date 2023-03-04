package main.java.algorithm.boj.tier.silver.p2304_창고다각형;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int N = Integer.parseInt(br.readLine());

		Map<Integer, Integer> LH = new TreeMap<>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			LH.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}

		List<Integer> oH = new ArrayList<>(); // L 기준으로 H 정렬하기
		List<Integer> oL = new ArrayList<>(LH.keySet()); // L을 LH Map에서 가져와서 소팅할 것

		oL.sort(Comparator.naturalOrder());

		for(int k:oL) {
			oH.add(LH.get(k));
		}

//		System.out.println(Arrays.toString(oH.toArray()));
//		System.out.println(Arrays.toString(oL.toArray()));
		int result = 0;

		// 왼쪽에서부터 더 큰 애가 나왔을 때만 이전 idx부터 지금 idx까지 이전 max*(현  idx- 이전 idx)
		int idx = oL.get(0);
		int max = oH.get(0);

		int rIdx = oL.get(oL.size()-1);
		int rMax = oH.get(oH.size()-1);
		if(N>1){

			boolean flag = true;
			for (int i = 1; i < oL.size(); i++) {
//				System.out.println(result);
				if(i == oL.size()-1){ // 만약 가장 마지막 idx에 도달했다면
					if(oH.get(i)==max){ // 근데 높이가 최대랑 같다?
						flag = false;
						result+= max*(oL.get(i)+1-idx);
						break;
					}else if(oH.get(i)>max){ // 근데 높이가 최대보다 크다?
						flag = false;
						result += max*(oL.get(i)-idx);
						result += oH.get(i)*1;
						break;
					}else{ // 그냥 최대보다 작다?
						// 넘어가
					}
				}
				if(oH.get(i)>max){ //
					result += max*(oL.get(i)-idx);
					max = oH.get(i);
					idx = oL.get(i);
				}
			}
//			System.out.println("=====");
			if(flag){ // 오른쪽에서 더해줘야할 때만

				for (int i = oL.size()-2; i >= 1; i--){
//					System.out.println(result);
					if(oH.get(i)==max){
						if(oL.size()-2>=i){
							result += rMax*(rIdx+1-oL.get(i)-1);
						}
						if(oL.get(i)==idx){
							result+=max*1;
							break;
						}else{
							result+=max*(oL.get(i)+1-idx);
							break;
						}
					}

					if(rMax<oH.get(i)){
						result += rMax*(rIdx+1-oL.get(i)-1);
						rMax = oH.get(i);
						rIdx = oL.get(i);
					}
				}
			}
		}else{
			result+= oH.get(0);
		}
		sb.append(result);


		bw.append(sb);
		bw.flush();
		br.close();
		bw.close();

	}
}
