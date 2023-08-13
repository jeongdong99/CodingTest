
public class Consecutive{
    public static void main(String[] args){
        Solution s = new Solution();
        for(int i =0; i < s.solution(3,12).length;i++){
            System.out.println(s.solution(3,12)[i]);
        }
    }
}

class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int sum = 0;   // 연속된 수들에서 상수들만의 합
        int x;         // 변수 x를 저장하기 위한 변수

        for(int i = 0; i < num; i++){  // 연속된 수들에서 상수들만의 합
            sum += i;             //ex) num = 3 이면 x + x+1 + x+2 = 3x + 3  상수 3 추출
        }

        x = (total - sum) / num;   // 3x + 3 = 12 -> num * x + sum = total

        for(int i = 0; i < num; i++){  // answer에 x부터 x+num-1까지 넣어주기
            answer[i] = x + i;
        }
        return answer;
    }
}