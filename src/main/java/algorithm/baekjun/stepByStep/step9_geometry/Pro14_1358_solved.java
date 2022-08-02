package main.java.algorithm.baekjun.stepByStep.step9_geometry;

// 2022-08-03 08:17~08:31 한 번에 성공!
// 하키

import java.io.*;
import java.util.StringTokenizer;

public class Pro14_1358_solved {

    public static void main (String[] args) throws IOException {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder stringBuilder = new StringBuilder();

        StringTokenizer WHXYP = new StringTokenizer(bufferedReader.readLine(), " ");
        int W = Integer.parseInt(WHXYP.nextToken());
        int H = Integer.parseInt(WHXYP.nextToken());
        int X = Integer.parseInt(WHXYP.nextToken());
        int Y = Integer.parseInt(WHXYP.nextToken());
        int P = Integer.parseInt(WHXYP.nextToken());

        int count = 0;

        for (int i = 0; i < P; i++) {
            StringTokenizer player = new StringTokenizer(bufferedReader.readLine(), " ");
            int a = Integer.parseInt(player.nextToken());
            int b = Integer.parseInt(player.nextToken());

            if((X<=a && a<=X+W) && (Y<=b && b<=Y+H)){
                count++;
            }else if((H/2)*(H/2) >= (a-X)*(a-X) + (b-Y-(H/2))*(b-Y-(H/2))){
                count++;
            }else if((H/2)*(H/2) >= (a-X-W)*(a-X-W) + (b-Y-(H/2))*(b-Y-(H/2))){
                count++;
            }
        }
        stringBuilder.append(count);
        bufferedWriter.write(String.valueOf(stringBuilder));
        bufferedWriter.flush();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
