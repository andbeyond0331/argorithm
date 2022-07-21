package main.java.algorithm.baekjun.stepByStep.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro5_9663_1_solved_repeat_needed {

    public static int[] arr;
    public static int N;
    public static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        dfs(0);
        System.out.println(count);

    }

    static void dfs(int depth) {
        if (depth == N) {
            count++;
            return;
        }

        for (int i = 0; i < N; i++) {
            arr[depth] = i;
            if (horse(depth)) {
                dfs(depth + 1);
            }
        }

    }

    public static boolean horse(int dep) {

        for (int i = 0; i < dep; i++) {
            if (arr[dep] == arr[i]) {
                return false;
            }

            else if (Math.abs(dep - i) == Math.abs(arr[dep] - arr[i])) {
                return false;
            }
        }

        return true;
    }
}
