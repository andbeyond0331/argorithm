import java.util.*;
class Solution {
  public static int solution(int cacheSize, String[] cities) {
         int answer = 0;
        for (int i = 0; i < cities.length; i++) {
			for (int j = 0; j < cities[i].length(); j++) {
				if(cities[i].charAt(j)>='A' && cities[i].charAt(j)<='Z') {
//					System.out.println(cities[i].charAt(j));
					String word = String.valueOf(cities[i].charAt(j)).toLowerCase();
//					System.out.println(word);
					cities[i] = cities[i].substring(0,j)+word+cities[i].substring(j+1);
//					System.out.println(cities[i]);
				}
			}
			// 소문자로 다 바꿈
			
		}
        int num = 0;
        if(cacheSize==0) {
        	answer = 5*cities.length;
        }else {
	         Map<String, Integer> city = new HashMap<>();
	        Queue<String> cityQ = new LinkedList<>();
	//        int[][] city = new int[cacheSize][1];
	        for (int i = 0; i < cities.length; i++) {
				if(city.size()<cacheSize) {
					if(city.containsKey(cities[i])) {
						answer ++;
					    cityQ.remove(cities[i]);
					    cityQ.add(cities[i]);
					    city.put(cities[i], num++);
					}else {
						answer += 5;
						cityQ.add(cities[i]);
						city.put(cities[i], num++);
					}
				}else {
					if(city.containsKey(cities[i])) {
						answer++;
						cityQ.remove(cities[i]);
						cityQ.add(cities[i]);
						city.put(cities[i], num++);
					}else {
						answer += 5;
						city.remove(cityQ.poll());
						cityQ.add(cities[i]);
						city.put(cities[i], num++);
					}
				}
			}
//	        System.out.println(Arrays.toString(cities));
        }
       
        return answer;
    }
}