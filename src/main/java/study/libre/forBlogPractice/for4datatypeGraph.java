package main.java.study.libre.forBlogPractice;

import java.util.ArrayList;
import java.util.Stack;

public class for4datatypeGraph {



    public static void main(String[] args) {
        // ArrayList를 이용해서 구현한 양방향 인접리스트 소스코드
        int initSize = 6;
        ListGraph adjList = new ListGraph(initSize);

        adjList.put(1,2);
        adjList.put(1,3);
        adjList.put(2,3);
        adjList.put(2,4);
        adjList.put(3,4);
        adjList.put(3,5);
        adjList.put(4,5);
        adjList.put(4,6);

        adjList.printGraphToAdjList();
    }

    public static String reverseString(String str){
        Stack stack = new Stack();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.substring(i,i+1));
        }
        while(!stack.isEmpty()){
            result+=stack.pop();
        }
        return result;
    }

}

class ListGraph{

    private ArrayList<ArrayList<Integer>> listGraph;

    public ListGraph(int initSize){
        this.listGraph = new ArrayList<ArrayList<Integer>>(); // 그래프 생성

        // 그래프 초기화
        // put(int x, int y) 에서 입력되는 정점의 값은 0 이상의 정수이나
        // ArrayList의 index는 0부터 시작이므로
        // ArrayIndexOutOfBoundsException방지를 위해
        // 정점을 담는 인접리스트의 size는 1을 더하여 초기화해줌
        // ex) initSize = 3
        // graph[0]
        // graph[1] -> 2 -> 3
        // graph[2] -> 1 -> 3 -> 4
        // graph[3] -> 1 -> 2 -> 4 -> 5
        //

        for (int i = 0; i < initSize+1; i++) {
            listGraph.add( new ArrayList<Integer>());
        }
    }

    // 그래프 return
    public ArrayList<ArrayList<Integer>> getGraph() {
        return this.listGraph;
    }

    // 그래프의 특정 노드 return
    public ArrayList<Integer> getNode(int i){
        return this.listGraph.get(i);
    }

    // 그래프 추가 (양방향)
    public void put(int x, int y){
        listGraph.get(x).add(y);
        listGraph.get(y).add(x);
    }
    // 그래프 추가 (단방향)
    public void putSingle(int x, int y){
        listGraph.get(x).add(y);
    }

    // 그래프 출력(인접리스트)
    public void printGraphToAdjList(){
        for (int i = 0; i < listGraph.size(); i++) {
            System.out.print("정점 "+ i + "의 인접 리스트");

            for (int j = 0; j < listGraph.get(i).size(); j++) {
                System.out.print(" -> " + listGraph.get(i).get(j));
            }
            System.out.println();
        }
    }
}
