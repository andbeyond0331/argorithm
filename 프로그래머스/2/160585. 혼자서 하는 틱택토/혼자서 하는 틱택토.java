class Solution {
    public int solution(String[] board) {
        int answer = -1;
        String[][] newBoard = new String[3][3];
        newBoard[0][0] = board[0].substring(0,1);
        newBoard[0][1] = board[0].substring(1,2);
        newBoard[0][2] = board[0].substring(2,3);
        newBoard[1][0] = board[1].substring(0,1);
        newBoard[1][1] = board[1].substring(1,2);
        newBoard[1][2] = board[1].substring(2,3);
        newBoard[2][0] = board[2].substring(0,1);
        newBoard[2][1] = board[2].substring(1,2);
        newBoard[2][2] = board[2].substring(2,3);
        // for(int i = 0; i < 3; i++) {
        //     for(int j = 0; j < 3; j++) {
        //         System.out.print(newBoard[i][j]);
        //     }
        //     System.out.println();
        // }
        int point = 0;
        int x = 0;
        int o = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(newBoard[i][j].equals(".")) {
                    point++;
                }else if(newBoard[i][j].equals("X")) {
                    x++;
                }else{
                    o++;
                     }
            }
        }
        // System.out.println("point: " + point);
        // System.out.println("x: " + x);
        // System.out.println("o: " + o);
        if(point == 9) {
            answer = 1;
        }else{
            if(x>o || o>x+1) {
                answer = 0;
            }else{
                if(
                    board[0].equals("OOO") ||
                    board[1].equals("OOO") ||
                    board[2].equals("OOO") ||
                    (newBoard[0][0].equals("O") && newBoard[1][0].equals("O") && newBoard[2][0].equals("O")) ||
                    (newBoard[0][1].equals("O") && newBoard[1][1].equals("O") && newBoard[2][1].equals("O"))||
                    (newBoard[0][2].equals("O") && newBoard[1][2].equals("O") && newBoard[2][2].equals("O")) ||
                    (newBoard[0][0].equals("O") && newBoard[1][1].equals("O") && newBoard[2][2].equals("O")) || 
                    (newBoard[2][0].equals("O") && newBoard[1][1].equals("O") && newBoard[0][2].equals("O"))
                ) {
                    if(x==o) {
                        answer = 0;
                    }else if(x==o-1){
                        if(
                    board[0].equals("XXX") ||
                    board[1].equals("XXX") ||
                    board[2].equals("XXX") ||
                    (newBoard[0][0].equals("X") && newBoard[1][0].equals("X") && newBoard[2][0].equals("X")) ||
                    (newBoard[0][1].equals("X") && newBoard[1][1].equals("X") && newBoard[2][1].equals("X"))||
                    (newBoard[0][2].equals("X") && newBoard[1][2].equals("X") && newBoard[2][2].equals("X")) ||
                    (newBoard[0][0].equals("X") && newBoard[1][1].equals("X") && newBoard[2][2].equals("X")) || 
                    (newBoard[2][0].equals("X") && newBoard[1][1].equals("X") && newBoard[0][2].equals("X"))
                    
                    ){
                            answer = 0;
                        }else{
                            answer = 1;
                        }
                        
                    }else{
                        answer = 0;
                    }
                }else {
                    
                    if(
                    board[0].equals("XXX") ||
                    board[1].equals("XXX") ||
                    board[2].equals("XXX") ||
                    (newBoard[0][0].equals("X") && newBoard[1][0].equals("X") && newBoard[2][0].equals("X")) ||
                    (newBoard[0][1].equals("X") && newBoard[1][1].equals("X") && newBoard[2][1].equals("X"))||
                    (newBoard[0][2].equals("X") && newBoard[1][2].equals("X") && newBoard[2][2].equals("X")) ||
                    (newBoard[0][0].equals("X") && newBoard[1][1].equals("X") && newBoard[2][2].equals("X")) || 
                    (newBoard[2][0].equals("X") && newBoard[1][1].equals("X") && newBoard[0][2].equals("X"))
                    
                    ) {
                        if(x==o) {
                            answer = 1;
                        }else{
                            answer = 0;
                        }
                    }else{
                        answer = 1;
                    }
                }
            }
        }
        
        
        return answer;
    }
}