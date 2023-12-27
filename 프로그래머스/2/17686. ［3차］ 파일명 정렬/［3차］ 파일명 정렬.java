import java.util.*;

class Name {
    String head;
    String number;
    String tail;
    public Name(String head, String number, String tail) {
        this.head = head;
        this.number = number;
        this.tail = tail;
    }
    public String getHead() {
        return this.head;
    }
    public String getNumber() {
        return this.number;
    }
    public String toString() {
        return head+number+tail;
    }
}

class Solution {
    static Name[] names;
    public String[] solution(String[] files) {
        String[] answer = {};
        // 단순히 코드 순이 아닌 숫자를 반영한 정렬기능
        // head / number / tail
        // head 사전 순 정렬 -> 문자열 비교 시 대소문자 구분 안 함
        // 대소문자 차이 외에 같을 경우, number의 숫자 순으로 정렬
        // 9 < 10 < 0011 < 012 < 13 < 014
        // 숫자 앞의 0은 무시 / 012와 12는 정렬시 같은 값
        names = new Name[files.length];
        for(int i = 0; i < files.length; i++) {
            String temp = files[i];
            int numberIndex = 0;
            int tailIndex = 0;
            boolean numberFlag = false;
            for(int j = 0; j < files[i].length(); j++) {
                if(tailIndex > 0) {
                    break;
                }else if(numberIndex > 0) { // number 시작부분 찾은 상태
                    if('0'>files[i].charAt(j) || files[i].charAt(j)>'9'){
                        tailIndex = j;
                    }
                }else { // 넘버 시작 부분 못 찾은 상태
                    if('0'<=files[i].charAt(j) && files[i].charAt(j)<='9') {
                        // System.out.println(temp + " : " + files[i].charAt(j));
                        numberIndex = j;
                    }
                }
            }
            // System.out.println(numberIndex + ", " + tailIndex);
            if(tailIndex>numberIndex+5) {
                tailIndex = numberIndex+5;
            }
            String tail = "";
            String num = "";
            if(tailIndex!=temp.length() && tailIndex!=0) {
                tail = temp.substring(tailIndex);
                num = temp.substring(numberIndex, tailIndex);
            }else {
                num = temp.substring(numberIndex);
            }
            Name n = new Name(temp.substring(0, numberIndex), num, tail);
            names[i] = n;
        }
        // for(int i = 0; i < names.length; i++) {
        //     System.out.println(names[i].getHead() + ", " + names[i].getNumber());
        // }
        for(int i = 1; i < names.length; i++) {
            for(int j = 0; j < names.length-i; j++) {
                swap(j, j+1);
            }
        }
        answer = new String[names.length];
        for(int i = 0; i < names.length; i++) {
            answer[i] = names[i].toString();
        }
        
        return answer;
    }
    static void swap(int a, int b) {
        if(compare(a, b)) {
            Name tempR = names[b];
            names[b] = names[a];
            names[a] = tempR;
        }
    }
    static boolean compare(int a, int b) {
        Name lName = names[a];
        Name rName = names[b];
        String upperLHead = lName.getHead().toUpperCase();
        String upperRHead = rName.getHead().toUpperCase();
        int numL = Integer.parseInt(lName.getNumber());
        int numR = Integer.parseInt(rName.getNumber());
        if(upperLHead.compareTo(upperRHead)>0) {
            return true;
        }else if(upperLHead.compareTo(upperRHead)<0) {
            return false;
        }else {
            if(numL<=numR){
                return false;
            }else {
                return true;
            }
        }
    }
}