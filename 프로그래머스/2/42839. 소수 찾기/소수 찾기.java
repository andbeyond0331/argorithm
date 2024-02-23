import java.util.*;

class Solution {
    static Set<Integer> primes;
    static boolean[] visited;
    static String num;
    public int solution(String numbers) {
        int answer = 0;
        num = numbers;
        // numbers -> 만들어지는 애들이 중복이면 안됨
        primes = new HashSet<>();
        // visited = new boolean[numbers.length()];
        
        for(int i = 1; i <=numbers.length(); i++) {
            visited = new boolean[numbers.length()];
            perm("", 0, numbers.length(), i);
        }
        for(int i: primes) {
            if(i!=0 && i!=1) {
                if(check(i)) {
                    answer++;
                    // System.out.println("true: " + i);
                }
            }
            // System.out.println(i);
        }
        
        return answer;
    }
    static boolean check(int n) {
        for(int i = 2; i < n; i++) {
            if(n%i==0){
                // System.out.println("n: " + n + ", i: " + i);
                return false;
            }
        }
        // System.out.println("n: " + n);
        return true;
    }
    static void perm(String s, int depth, int n, int r) {
        if(depth == r) {
            primes.add(Integer.parseInt(s));
            return;
        }
        for(int i = 0; i < n; i++) {
            if(visited[i] != true) {
                visited[i] = true;
                s += num.substring(i, i+1);
                perm(s, depth+1, n, r);
                s = s.substring(0, s.length()-1);
                visited[i] = false;
            }
        }
    }
}