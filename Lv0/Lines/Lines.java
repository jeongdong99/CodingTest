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


        int[] duplicate = new int[201];

        for(int i = 0; i < 201; i++){
            int cnt = 0;
            for(int j = 0; j < lines.length;j++){
                if(lines[j][0] <= i -100 && i - 100 < lines[j][1]){
                    duplicate[i] = ++cnt;
                }
            }
        }

        for(int i = 0 ; i <201;i++){
           if( duplicate[i] >= 2 ) {
               answer++;
           }
        }

        return answer;
    }
}