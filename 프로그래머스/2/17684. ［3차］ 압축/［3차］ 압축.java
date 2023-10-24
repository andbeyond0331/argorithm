
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	static List<String> dictionary;
	public static int[] solution(String msg) {
        int[] answer;
        List<Integer> ansList = new ArrayList<>();
        // 초기화
        dictionary = new ArrayList<String>();
        for (int i = 'A'; i <= 'Z'; i++) {
			dictionary.add(String.valueOf((char)(i)));
		}
        int cursor = 0;
        while(0 < msg.length()) {
//        	System.out.println(msg + ": msg");
        	String w = "";
        	int index = 0;
        	outer: for (int i = msg.length(); i >= cursor+1; i--) {
        		for (int j = 0; j < dictionary.size(); j++) {
        			if(dictionary.get(j).equals(msg.substring(cursor, i))) {
        				index = j+1;
        				w = msg.substring(cursor, i);
        				ansList.add(index);
        				if(i<msg.length()) {
        					msg = msg.substring(i);
        				}else {
        					msg = "";
        				}
        				
        				if(msg.length()>0) {
        					dictionary.add(w+msg.substring(0, 1));
        				}
        				break outer;
        			}
        		}
        	}
        	
        }

		answer = new int[ansList.size()];
		for (int j = 0; j < ansList.size(); j++) {
			answer[j] = ansList.get(j);
		}
      
        return answer;
    }
}