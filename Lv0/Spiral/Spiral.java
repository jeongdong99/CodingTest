public class Spiral{
    public static void main(String[] args) {
        Solution s = new Solution();

        for(int i = 0; i < 4; i++){
            for(int j = 0; j <4;j++){
                System.out.print(s.solution(4)[i][j]);
            }
            System.out.println();
        }
    }
}

class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n]; // n X n 크기의 배열 생성
        int cnt = 0;  // 개수
        char direction = 'E'; // 방향 'N' 'S' 'W' 'E'
        int x = 0; // 행
        int y = 0; // 열

        while (cnt < n * n ) {
            if (direction == 'E') {   // 오른쪽
                try {
                    while (true) {
                        if (answer[x][y] != 0) { // 지금 자리가 0이 아닌 수가 있으면
                            x++;  // 아래로 한칸
                            y--;  // 왼쪽으로 한칸
                            direction = 'S'; // 방향은 아래로
                            break;
                        }
                        answer[x][y++] = ++cnt;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    x++;  // 위와 동일
                    y--;
                    direction = 'S';
                }
            } else if (direction == 'S') {  // 아래쪽
                try {
                    while (true) {
                        if (answer[x][y] != 0) {
                            x--;  // 위로 한칸
                            y--; //  왼쪽으로 한칸
                            direction = 'W';  // 방향은 왼쪽으로
                            break;
                        }
                        answer[x++][y] = ++cnt;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    x--;
                    y--;
                    direction = 'W';
                }
            } else if (direction == 'W') {  // 왼쪽
                try {
                    while (true) {
                        if (answer[x][y] != 0) {
                            x--;  // 위로 한칸
                            y++;  // 오른쪽으로 한칸
                            direction = 'N';  // 방향은 위쪽으로
                            break;
                        }
                        answer[x][y--] = ++cnt;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    x--;
                    y++;
                    direction = 'N';
                }
            } else if (direction == 'N') {  // 위쪽
                try {
                    while (true) {
                        if (answer[x][y] != 0) {
                            x++;  // 아래로 한칸
                            y++;  // 오른쪽으로 한칸
                            direction = 'E';  // 방향은 오른쪽으로 다시 반복
                            break;
                        }
                        answer[x--][y] = ++cnt;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    x++;
                    y++;
                    direction = 'E';
                }
            }
        }
        return answer;
    }
}