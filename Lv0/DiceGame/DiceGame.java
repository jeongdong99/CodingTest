import java.util.Arrays;

public class DiceGame{
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.print(s.solution(6,4,2,5));
        }
}

class Solution {
    public int solution(int a,int b, int c, int d) {
        int[] arr = {a, b, c, d};
        int answer = 0;

        Arrays.sort(arr); // Array를 써서 정렬

        if (arr[0] == arr[3]) {  // 정렬 후 처음과 끝이 같으면 4개 다 같음
            answer = 1111 * arr[3];
        } else if (arr[0] == arr[2] || arr[1] == arr[3]) { // 1번째 == 3번쨰 || 2번째 == 4번째 3개가 같은 것
            answer = (int) Math.pow(arr[1] * 10 + (arr[0] + arr[3] - arr[1]), 2);
        } else if (arr[0] == arr[1] && arr[2] == arr[3]) { // 1번째 == 2번째 && 3번째 == 4번째 2개 2개 같은 것
            answer = (arr[0] + arr[3]) * (arr[3] - arr[0]);
        } else if (arr[0] == arr[1]) { // 1번째 == 2번째 하나만 같은 것
            answer = arr[2] * arr[3];
        } else if (arr[1] == arr[2]) {  // 2번째 == 3번째 하나만 같은 것
            answer = arr[0] * arr[3];
        } else if (arr[2] == arr[3]) {  // 3번째 == 4번째 하나만 같은 것
            answer = arr[0] * arr[1];
        } else {  // 그 이외는 같은 것이 하나도 없는 것
            answer = arr[0];
        }

        return answer;
    }
}