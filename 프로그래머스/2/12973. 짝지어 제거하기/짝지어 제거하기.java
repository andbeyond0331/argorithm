import java.util.*;

class Solution
{
    public int solution(String s)
    {
 int answer = -1;
        String compare = s;


        int count = 0;

        Stack<String> stack = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                if(stack.size()!=0){
                    if(s.substring(i,i+1).equals(stack.peek())){
                        stack.pop();

                        count++;


                    }else{

                        stack.push(s.substring(i,i+1));
                    }
                }else{

                    stack.push(s.substring(i,i+1));
                }
            }
            if(count==0){
                answer =0;

            }



        if(stack.size()!=0){
            answer = 0;

        }else{
            answer = 1;
        }


        return answer;
    }
}