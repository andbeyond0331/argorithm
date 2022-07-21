package main.java.study.libre.forBlogPractice;

import java.util.Stack;

public class for4datatypeStack {

    public static void main(String[] args) {
        // Stack으로 문자열 뒤집는 함수 만들기
        System.out.println(reverseString("apple"));
    }

    public static String reverseString(String str){
        Stack stack = new Stack();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.substring(i,i+1));
        }
        while(!stack.isEmpty()){
            result+=stack.pop();
        }
        return result;
    }

}
