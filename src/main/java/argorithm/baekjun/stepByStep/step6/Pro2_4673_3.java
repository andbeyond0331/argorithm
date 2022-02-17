package main.java.argorithm.baekjun.stepByStep.step6;

import java.util.Vector;

public class Pro2_4673_3 {

    // 출력 초과 해결 시도 2

    static void selfNumber(int inputNumber){

        Vector number = new Vector();

        //1부터 10000까지 number에 넣기
        for (int i = 0; i < inputNumber; i++) {
            number.add(i+1);
        }

        //삭제 타겟 모을 vector
        Vector newNums = new Vector();

        //삭제 타겟 찾아 모으기
        for (int i = 0; i < inputNumber; i++) {
            int popTarget = 0;
            int n = (int)number.get(i);
            if(n>0 && n<10){
                popTarget=n+n;
            }else if(n>9 && n<100){
                popTarget = n+n/10+n%10;
            }else if(n>99 && n<1000){
                popTarget = n + n/100 + n/10 - n/100*10+ n%10;
            }else if(n>999 && n<10000){
                popTarget = n + n/1000 + n/100 - n/1000*100*2 + n/10 - n/100*10 + n%10;
            }else{
                popTarget = 10001;
            }

            if(popTarget<=inputNumber && number.contains(popTarget)){
                newNums.add(popTarget);
            }
        }

        for (int i = 0; i < newNums.size(); i++) {
            number.remove(newNums.get(i));
        }

        for (int i = 0; i < number.size(); i++) {
            System.out.println(number.get(i));
        }

    }

    public static void main(String[] args) {

        selfNumber(10000);

    }
}
