import java.util.*;

class Solution {
    // static boolean[] visited;
    public int solution(int[] people, int limit) {
        int answer = 0;
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i = 0; i < people.length; i++) {
        //     if(map.containsKey(people[i])) {
        //         map.put(people[i], map.get(people[i])+1);
        //     }else {
        //         map.put(people[i], 1);
        //     }
        // }
        
        // int[] mapKey = people.clone();
        // Arrays.sort(mapKey);
        // int lighter = 0;
        // int heavier = mapKey.length-1;
        // for(Object i: mapKey) {
        //     System.out.println("key: " + i + ", value: " + map.get(i));
        // }
        
        // while(!map.isEmpty() || lighter<=heavier) {
        //     if(mapKey[lighter] + mapKey[heavier] > limit) {
        //         if(map.get(mapKey[heavier])==1) {
        //             map.remove(mapKey[heavier]);
        //         }else {
        //             map.put(mapKey[heavier], map.get(mapKey[heavier])-1);
        //         }
        //         heavier--;
        //         answer++;
        //     }else{
        //         if(map.get(mapKey[heavier])==1){
        //             map.remove(mapKey[heavier]);
        //         }else {
        //             map.put(mapKey[heavier], map.get(mapKey[heavier])-1);
        //         }
        //         heavier--;
        //         if(map.get(mapKey[lighter])==1) {
        //             map.remove(mapKey[lighter]);
        //         }else {
        //             map.put(mapKey[lighter], map.get(mapKey[lighter])-1);
        //         }
        //         lighter--;
        //         answer++;
        //     }
        // }
        
        int[] arr = people.clone();
        Arrays.sort(arr);
        int l = 0;
        int h = arr.length-1;
        while(l<=h) {
            if(l==h) {
                answer++;
                break;
            }
            if(arr[l] + arr[h]>limit) {
                h--;
                answer++;
            }else {
                l++;
                h--;
                answer++;
            }
        }
//         List<Integer> pList = new ArrayList();
//         for (int i = 0; i < people.length; i++) {
//             pList.add(people[i]);
//         }
//         pList.sort(Comparator.naturalOrder());
  
//         while(pList.size()>0) {
//             if(pList.get(pList.size()-1)>limit) {
//                 answer++;
//                 pList.remove(pList.size()-1);
//             }else if(pList.size()>1 && pList.get(0) + pList.get(pList.size()-1)>limit) {
//                 answer++;
//                 pList.remove(pList.size()-1);
//             }else if(pList.size()>1 && pList.get(0) + pList.get(pList.size()-1)<=limit){
//                 answer++;
//                 pList.remove(0);
//                 pList.remove(pList.size()-1);
                
//             }else {
//                 answer++;
//                 pList.remove(0);
//             }
//         }
        
        
//         while(true) {
//             if(pList.size()>1) {
//                 if(pList.get(0) + pList.get(pList.size()-1)>limit) {
//                     answer++;
//                     pList.remove(pList.size()-1);
//                 }else {
//                     pList.remove(0);
//                     pList.remove(pList.size()-1);
//                     answer++;
//                 }    
//             }else if(pList.size()==1){
//                 answer++;
//                 pList.remove(0);
//                 break;
//             }else {
//                 break;
//             }
          
//         }
        return answer;
    }
}