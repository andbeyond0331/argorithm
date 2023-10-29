import java.util.*;

class Solution {
    static char[][] blocks; 
	static int[] dr = {0, 1, 1};
	static int[] dc = {1, 0, 1};
	public static int solution(int m, int n, String[] board) {
        int answer = 0;
        blocks = new char[m][n];
        
        for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < n; j++) {
				blocks[i][j] = board[i].charAt(j);
			}
		}
        // blocks에 다 담았다
        
       while(check()) {
        	List<int[]> list = new ArrayList<int[]>();
        	char[][] newBlocks = new char[m][n];
        	for (int s = 0; s < m; s++) {
        		for (int t = 0; t < n; t++) {
        			newBlocks[s][t] = blocks[s][t];
        		}
        	}
        	for (int i = 0; i < blocks.length; i++) {
				for (int j = 0; j < blocks[0].length; j++) {
					if(checkBlock(i, j)) {
						
						int[] tmp1 = {i, j};
						int[] tmp2 = {i, j+1};
						int[] tmp3 = {i+1, j};
						int[] tmp4 = {i+1, j+1};
						
						boolean flag = false;
						for (int k = 0; k < list.size(); k++) {
							if(list.get(k)[0] == tmp1[0] && list.get(k)[1] == tmp1[1]) {
								flag = true;
								break;
							}
						}
						if(!flag) {
							list.add(tmp1);
						}else{
							flag = false;
						}
						for (int k = 0; k < list.size(); k++) {
							if(list.get(k)[0] == tmp2[0] && list.get(k)[1] == tmp2[1]) {
								flag = true;
								break;
							}
						}
						if(!flag) {
							list.add(tmp2);
						}else{
							flag = false;
						}
						for (int k = 0; k < list.size(); k++) {
							if(list.get(k)[0] == tmp3[0] && list.get(k)[1] == tmp3[1]) {
								flag = true;
								break;
							}
						}
						if(!flag) {
							list.add(tmp3);
						}else{
							flag = false;
						}
						
						for (int k = 0; k < list.size(); k++) {
							if(list.get(k)[0] == tmp4[0] && list.get(k)[1] == tmp4[1]) {
								flag = true;
								break;
							}
						}
						if(!flag) {
							list.add(tmp4);
						}else{
							flag = false;
						}
						
						newBlocks[i][j] = ' ';
						newBlocks[i][j+1] = ' ';
						newBlocks[i+1][j] = ' ';
						newBlocks[i+1][j+1] = ' ';
						
					}

					
				}
			} 
        	
        	for (int k = 0; k < newBlocks.length; k++) {
				for (int k2 = 0; k2 < newBlocks[0].length; k2++) {
					if(newBlocks[k][k2] == ' ') {
						for (int l = k; l > 0; l--) {
							newBlocks[l][k2] = newBlocks[l-1][k2];
						}
						newBlocks[0][k2] = ' ';
					}
					
				}
			}
        	
        	
        	
        	for (int k = 0; k < blocks.length; k++) {
				for (int k2 = 0; k2 < blocks[0].length; k2++) {
					blocks[k][k2] = newBlocks[k][k2];
				}
			}

        	
        	answer+=list.size();
        }
        return answer;
    }
	
	
	static boolean check() {
//		System.out.println("check");
		for (int i = 0; i < blocks.length-1; i++) {
			for (int j = 0; j < blocks[0].length-1; j++) {
				
				char tmp = blocks[i][j];
				if(tmp!=' ') {
					
					int cnt = 0;
					for (int d = 0; d < dr.length; d++) {
						int nr = i+dr[d];
						int nc = j+dc[d];
						if(nr >= 0 && nr<blocks.length && nc>=0 && nc<blocks[0].length) {
							if(blocks[nr][nc]==tmp) {
								cnt++;
							}else {
								break;
							}
						}
					}
					if(cnt==3) {
						return true;
					}
				}else {
					continue;
				}
			}
		}
		return false;
	}
	static boolean checkBlock(int r, int c) {
		int cnt = 0;
		if(blocks[r][c]!=' ') {
			
			for(int d = 0; d < dr.length; d++) {
				int nr = r+dr[d];
				int nc = c+dc[d];
				if(nr >= 0 && nr<blocks.length && nc>=0 && nc<blocks[0].length) {
					if(blocks[nr][nc]==blocks[r][c]) {
						cnt++;
					}else {
						break;
					}
				}
			}
			if(cnt==3) {
				return true;
			}
		}
		return false;
	}
}