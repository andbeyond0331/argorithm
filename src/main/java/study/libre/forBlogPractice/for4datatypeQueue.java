package main.java.study.libre.forBlogPractice;

import java.util.LinkedList;
import java.util.Queue;

public class for4datatypeQueue {

    public static void main(String[] args) {
        // Queue 그냥 구현해보기
        System.out.println(reverseString("apple"));
    }

    public static String reverseString(String str){
        Queue queue = new LinkedList();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            queue.add(str.substring(i,i+1));
        }
        while(!queue.isEmpty()){
            result+=queue.poll();
        }
        return result;
    }

}
