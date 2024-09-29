import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i = 0;i < phone_book.length-1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])) {
                answer = false;
                break;
            } 
        }
//         outer: for(int i= 0; i < phone_book.length-1; i++) {
//             String a = phone_book[i];
//             for(int j = i + 1; j < phone_book.length; j++) {
//                 String b = phone_book[j];
                
//                 if(a.length()<b.length()) {
//                     if(b.startsWith(a)) {
//                         answer = false;
//                         break outer;
//                     }
//                 }
//             }
//         }
        
        // outer: for(int i = 0;i < phone_book.length-1; i++) {
        //     String a = phone_book[i];
        //     for(int j = i+1; j < phone_book.length; j++) {
        //         String b = phone_book[j];
        //         if(a.startsWith(b) || b.startsWith(a)) {
        //             answer = false;
        //             break outer;
        //         }
        //     }
        // }
        return answer;
    }
}