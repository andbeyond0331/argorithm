package main.java.likeLion.pro1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Pro1 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println("0을 입력하시면 입력이 종료 됩니다.");


        String a;
        List<String> list = new ArrayList<>();

        while(!(a= bufferedReader.readLine()).equals("0")){
            list.add(a);
            System.out.println("숫자 "+(list.size())+" : "+a);
        }


        System.out.println("숫자 "+(list.size()+1)+" : "+0);
        System.out.print("결과 : ");
        for (int i = 0; i < list.size(); i++) {

            if(i!=list.size()-1){
                System.out.print(list.get(i)+", ");
            }else{
                System.out.print(list.get(i));
            }

        }
    }
}
