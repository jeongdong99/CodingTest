
public class SafeZone{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        System.out.println(s.solution(board));
    }
}

class Solution {
    public int solution(int[][] board) {
        int answer = 0;

        for(int i = 0 ; i < board.length; i++){   //행 순회
            for(int j = 0; j < board[i].length; j++){  //열 순회
                if(board[i][j] == 1){  // 폭탄이면?
                    for(int m = i-1; m < i+2; m++){  // 위, 중간, 아래
                        for(int n = j-1; n < j+2; n++){ // 왼, 중간, 오른
                            if(m < 0 || n < 0 || m > board.length-1 || n > board.length-1){
                                continue; // arrayIndex를 넘어갈시 continue;로 넘어가기
                            }else{
                                if(board[m][n] != 1){ // 위, 아래, 좌, 우 대각선 칸이 폭탄이 아니면
                                    board[m][n] = 2;  // 위험지대로 바꿈
                                }
                            }
                        }
                    }
                }
            }
        }
        for(int i = 0 ; i < board.length; i++){  // 행 순회
            for(int j = 0; j < board.length; j++){ // 열 순회
                if(board[i][j]==0){
                    answer++;  // 안전지대면 answer+1;
                }
            }
        }
        return answer;
    }
}