package main.java.argorithm.baekjun.stepByStep.step7;

import java.util.Scanner;

public class Pro9_2941 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String ca = scanner.next();

        String[] table = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        if(ca =="" || ca == " "){
            System.out.println(0);
        }else{
            int ans = 0;
            String compare = ca;

            for (int i = 0; i < table.length-1; i++) {
                if(ca.contains(table[i])){
                    int sl = table[i].length();

                    String newCa = ca.replaceAll(table[i],"");
                    compare = compare.replaceAll(table[i], "");
                    int amount = (ca.length()-newCa.length())/sl; //몇글자 있었는지
                    ans+=amount;

                }
            }
            String secondCa = compare;
            if(secondCa.contains("z=")){

                String newCa = secondCa.replaceAll("z=","");
                compare = compare.replaceAll("z=", "");
                int amount = (secondCa.length()-newCa.length())/2; //몇글자 있었는지
                ans+=amount;
            }
            ans+=compare.length();



            System.out.println(ans);
        }



        scanner.close();
    }

}
