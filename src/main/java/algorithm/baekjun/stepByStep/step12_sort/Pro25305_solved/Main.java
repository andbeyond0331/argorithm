package main.java.algorithm.baekjun.stepByStep.step12_sort.Pro25305_solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

// 2022-08-09 10:53~11:00 성공!
// 커트라인
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());
        List<Integer> list = new ArrayList<>();
        stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(stringTokenizer.nextToken()));
        }
        list.sort(Comparator.reverseOrder());
        System.out.println(list.get(k-1));
    }
}
