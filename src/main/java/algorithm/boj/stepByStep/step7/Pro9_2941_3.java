package main.java.algorithm.boj.stepByStep.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro9_2941_3 {

    //처음부터 다시 - bufferedReader로

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        String al = br.readLine().trim();
        String outter = al;
        int result = 0;

        if(outter.contains("c=")){
            String inner = outter;
            String forCount = outter;
            outter = outter.replaceAll("c=", " ");
            forCount = forCount.replaceAll("c=", "");
            int len = (inner.length()-forCount.length())/2;
            result +=len;

        }

        if(outter.contains("c-")){
            String inner = outter;
            String forCount = outter;
            outter = outter.replaceAll("c-", " ");
            forCount = forCount.replaceAll("c-", "");
            int len = (inner.length()-forCount.length())/2;
            result +=len;

        }

        if(outter.contains("dz=")){
            String inner = outter;
            String forCount = outter;
            outter = outter.replaceAll("dz=", " ");
            forCount = forCount.replaceAll("dz=", "");
            int len = (inner.length()-forCount.length())/3;
            result +=len;

        }

        if(outter.contains("d-")){
            String inner = outter;
            String forCount = outter;
            outter = outter.replaceAll("d-", " ");
            forCount = forCount.replaceAll("d-", "");
            int len = (inner.length()-forCount.length())/2;
            result +=len;

        }

        if(outter.contains("lj")){
            String inner = outter;
            String forCount = outter;
            outter = outter.replaceAll("lj", " ");
            forCount = forCount.replaceAll("lj", "");
            int len = (inner.length()-forCount.length())/2;
            result +=len;

        }

        if(outter.contains("nj")){
            String inner = outter;
            String forCount = outter;
            outter = outter.replaceAll("nj", " ");
            forCount = forCount.replaceAll("nj", "");
            int len = (inner.length()-forCount.length())/2;
            result +=len;

        }

        if(outter.contains("s=")){
            String inner = outter;
            String forCount = outter;
            outter = outter.replaceAll("s=", " ");
            forCount = forCount.replaceAll("s=", "");
            int len = (inner.length()-forCount.length())/2;
            result +=len;

        }


        if(outter.contains("z=")){
            String inner = outter;
            String forCount = outter;
            outter = outter.replaceAll("z=", " ");
            forCount = forCount.replaceAll("z=", "");
            int len = (inner.length()-forCount.length())/2;
            result +=len;

        }

        outter = outter.replaceAll(" ", "");

        if(!outter.equals("")){
            result += outter.length();
        }



        System.out.println(result);


    }

}
