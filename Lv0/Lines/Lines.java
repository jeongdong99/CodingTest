public class Lines {
    public static void main(String[] args){
        int[][] lines = {{-1, 1}, {1, 3}, {3, 9}};
        Solution s = new Solution();
        System.out.println(s.solution(lines));
    }
}
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] duplicate = new int[201];   // -100~100까지 값을 저장하기위한 배열

        for(int i = 0; i < 201; i++){   // 음수는 배열에서 오류가 나므로 0부터시작
            int cnt = 0;  // 배열마다 개수를 체크하기 위한 변수
            for(int j = 0; j < lines.length;j++){
                if(lines[j][0] <= i - 100 && i - 100 < lines[j][1]){ //정수 구간은 (i <= x < i+1)
                    //해당 선분안에 포함되어있는 정수인지 확인
                    duplicate[i] = ++cnt; // 포함되어있으면 ++cnt
                }
            }
        }

        for(int i = 0 ; i <201;i++){
            if( duplicate[i] >= 2 ) {
                answer++;  //cnt가 2이상이면 선분 2개이상 겹친것이므로 answer+1;
            }
        }
        return answer;
    }
}
