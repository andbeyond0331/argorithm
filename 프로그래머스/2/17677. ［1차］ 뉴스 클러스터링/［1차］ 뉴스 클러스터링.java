import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
         int answer = 0;
        // 자카드 유사도 J(A, B)는 두 집합의 교집합 크기를 두 집합의 합집합 크기로 나눈 값
        if(str1.length() == 0 && str2.length() == 0) {
        	answer = 1;
        }else {
        	for (int i = 0; i < str1.length(); i++) {
				if(str1.charAt(i) >= 'A' && str1.charAt(i)<='Z') {
					str1 = str1.substring(0, i) + String.valueOf(str1.charAt(i)).toLowerCase() + str1.substring(i+1);
				}
			}
        	for (int i = 0; i < str2.length(); i++) {
				
        		if(str2.charAt(i) >= 'A' && str2.charAt(i)<='Z') {
        			str2 = str2.substring(0, i) + String.valueOf(str2.charAt(i)).toLowerCase() + str2.substring(i+1);
        		}
			}
        	// 소문자로 다 바꿔줌
        	Set<String> set = new HashSet<>();
        	Set<String> str1Set = new HashSet<>();
        	Set<String> str2Set = new HashSet<>();
        	Map<String, Integer> map1 = new HashMap<String, Integer>();
        	Map<String, Integer> map2 = new HashMap<String, Integer>();
        	
        	for (int i = 1; i < str1.length(); i++) {
				if(str1.charAt(i-1)>='a' && str1.charAt(i-1)<='z' && str1.charAt(i)>='a' && str1.charAt(i)<='z'){
					if(map1.containsKey(str1.substring(i-1, i+1))) {
						map1.put(str1.substring(i-1, i+1), map1.get(str1.substring(i-1, i+1))+1);
					}else {
						map1.put(str1.substring(i-1, i+1), 1);
					}
	
				}
			}
        	
        	
        	for (int i = 1; i < str2.length(); i++) {
        		if(str2.charAt(i-1)>='a' && str2.charAt(i-1)<='z' && str2.charAt(i)>='a' && str2.charAt(i)<='z'){
        			if(map2.containsKey(str2.substring(i-1, i+1))) {
        				map2.put(str2.substring(i-1, i+1), map2.get(str2.substring(i-1, i+1))+1);
        			}else {
        				map2.put(str2.substring(i-1, i+1), 1);
        			}
   			
        		}
        	}

        	int min = 0;
        	int max = 0;
        	for (String key: map1.keySet()) {
				if(map2.containsKey(key)) {
					min+=Math.min(map1.get(key), map2.get(key));
					max+=Math.max(map1.get(key), map2.get(key));
				}
				else {
					max+=map1.get(key);
				}
			}
        	for(String key: map2.keySet()) {
        		if(!map1.containsKey(key)) {
        			max+=map2.get(key);
        		}
        	}

        	if(max ==0) {
        		answer = 65536;
        	}else {
        		answer = 65536 *min/max;
        	}
        	
        }
        return answer;
    }
}