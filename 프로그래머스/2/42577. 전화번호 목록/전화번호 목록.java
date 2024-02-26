import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        for(int i = 0; i < phone_book.length-1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])) {
                return false;
            }
        }
//         for(int i = 0; i < phone_book.length-1; i++) {
//             for(int j = i+1; j < phone_book.length; j++) {
                
                // if(phone_book[i].length()!=phone_book[j].length() && phone_book[i].substring(0,1).equals(phone_book[j].substring(0,1))) {
                    // String shorter = phone_book[i].length()<phone_book[j].length()? phone_book[i]: phone_book[j];
                    // String longer = phone_book[i].length()<phone_book[j].length()?phone_book[j]:phone_book[i];
                    // if(longer.startsWith(shorter)) {
                    //     return false;
                    // }
//                     if(shorter.equals(longer.substring(0, shorter.length()))){
//                         return false;

//                     }
                // }
                
        //     }
        // }
        return answer;
    }
}