package main.java.likeLion.pro1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Pro5 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println("[안내] 0을 입력하시면 입력이 종료 됩니다.");


        String a;
        List<String> list = new ArrayList<>();

        while(!(a= bufferedReader.readLine()).equals("0")){
            list.add(a);

            System.out.println("숫자 "+(list.size())+" : "+a);
        }


        System.out.println("숫자 "+(list.size()+1)+" : "+0);
        System.out.print("결과 : ");

        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int num = Integer.parseInt(list.get(i));
            int count =0;
            for (int j = 1; j < num; j++) {
                if(num%j==0){
                    count++;
                }
            }
            if(count==1){
                list1.add(num);
            }
        }
        for (int i = 0; i < list1.size(); i++) {

            if(i!=list1.size()-1){
                System.out.print(list1.get(i)+", ");
            }else{
                System.out.print(list1.get(i));
            }

        }
    }
}
