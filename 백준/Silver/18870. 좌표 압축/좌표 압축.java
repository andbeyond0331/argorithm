
import com.sun.source.tree.Tree;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

//class Order implements Comparable<Order>{
//  int value;
//  int order;
//  Order(int value, int order) {
//    this.value = value;
//    this.order = order;
//  }
//  @Override
//  public int compareTo(Order other) {
//    return other.value - this.value;
//  }
//}
public class Main {
  static int N;
  static int[] nums;
  static int[] numbers;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    N = Integer.parseInt(br.readLine());
    StringTokenizer st = new StringTokenizer(br.readLine());
    nums = new int[N];
    Set<Integer> set = new TreeSet<>();
    for(int i = 0; i < N; i++) {
      int temp = Integer.parseInt(st.nextToken());
      set.add(temp);
      nums[i] = temp;
    }
    numbers = new int[set.size()];
    int index = 0;
    for(int i: set) {
      numbers[index++] = i;
    }
    StringBuilder sb = new StringBuilder();
    for(int i = 0;i < nums.length; i++) {
      if(i==nums.length-1) {
        sb.append(find(0, numbers.length-1, nums[i]));
      }else {
        sb.append(find(0, numbers.length-1, nums[i])).append(" ");
      }
    }
    System.out.println(sb);
  }
  static int find(int left, int right, int target) {
    int mid = (right+left)/2;
    if(numbers[mid]<target) {
      return find(mid+1, right, target);
    }else if(numbers[mid]>target) {
      return find(left, mid, target);
    }
    return mid;
  }
}
