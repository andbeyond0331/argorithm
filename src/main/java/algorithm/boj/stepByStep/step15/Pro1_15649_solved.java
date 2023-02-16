package main.java.algorithm.boj.stepByStep.step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;

public class Pro1_15649_solved {

    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    static StringTokenizer stringTokenizer;

    static {
        try {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static int N = Integer.parseInt(stringTokenizer.nextToken());
    static int M = Integer.parseInt(stringTokenizer.nextToken());

    static boolean[] visited = new boolean[N+1];
    static int[] arr = new int[N+1];
    static Vector<Integer> vector = new Vector<>();

    int count;



    public Pro1_15649_solved() throws IOException {
    }

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
            visited[i] = false;
        }
        DFS(0);




    }

    static void DFS(int count){
        if(count == M){
            for (int i = 0; i < vector.size(); i++) {
                System.out.print(vector.get(i) + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < N; i++) {
            if(visited[i]) {
                continue;
            }else{
                visited[i] = true;
                vector.add(arr[i]);
                DFS(count + 1);
                vector.remove(vector.size()-1);
                visited[i] = false;
            }
        }
    }
}
