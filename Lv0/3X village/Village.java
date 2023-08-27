public class Village{
    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 40;
            System.out.println(s.solution(n));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer++;
            if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                i--;
            }
        }

        return answer;
    }
}