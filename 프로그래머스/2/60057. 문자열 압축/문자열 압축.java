class Solution {
    public static int min;
    public int solution(String s) {
        int answer = 0;
        
        if(s.length()==1){
            answer = 1;
        }else{
            
            min = 2001;

            for(int i = 0; i < s.length()/2+2; i++){
                int temp = count(i,s);
                if(temp!=0){
                    min = Math.min(min, temp);
                }

            }

            answer = min;
        
        }
        
        
        return answer;
    }
    
//     public static int binary(int a){
        
//     }
    
    public static int count(int a, String s){
        String newString = "";
        int scount = 0;
        int cou = 0;
        boolean flag = true;
        if(a==0){
            cou=s.length();
        }else{
            String temp = "";
            for(int i=0; i<s.length(); i+=a){
                if(i==0){
                    
                    temp = s.substring(i,i+a);
                    // newString += temp;
                    
                // }else if(i==s.length()-1){
                //     if(temp.equals(s.substring(i,i+1))){
                //         cou+=1;
                //         break;
                //     }
                }else if(i+a>=s.length()){
                    if(temp.equals(s.substring(i,s.length()))){
                        if(flag){
                            scount = 2;
                            newString+=String.valueOf(scount)+temp;
                        }else{
                            scount++;
                            newString+=String.valueOf(scount)+temp;
                        }
                    }else{
                        if(flag){
                            newString +=temp+s.substring(i,s.length());

                            cou+=temp.length()+s.substring(i,s.length()).length();

                        }else{
                            newString+=String.valueOf(scount)+temp+s.substring(i,s.length());
                            cou+=temp.length()+s.substring(i,s.length()).length();
                        }
                    }
                    
                    // System.out.println("넘었니..? newString : " + newString);
                    // System.out.println("넘었니..? temp : " + temp);
                    break;
                }else{
                    if(!temp.equals(s.substring(i,i+a))){
                        if(flag){ // 반복 없었단 얘기
                            newString+=temp;
                            cou+=temp.length();
                            temp = s.substring(i,i+a);
                        }else{
                            newString+=String.valueOf(scount)+temp;
                            cou+=temp.length();
                            flag  = !flag;
                            temp = s.substring(i,i+a);
                            
                        }
                        
                        
                        
                    }else{
                        if(flag){ // 지금까지 반복 없었단 얘기
                            flag = !flag;
                            scount = 2;
                            cou++;
                        }else{
                            scount++;
                        }
                        
                        
                    }
                }
                
                
        // System.out.println("temp ; " + temp);
            }
        }
                // System.out.println("newString : " + newString);
        return newString.length();
        
        
    }
}