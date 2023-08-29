import java.util.*;
public class CreateString{
    public static void main(String[] args) {
        Solution s = new Solution();

        for(int i = 0; i < s.solution(10,9999).length;i++){
            System.out.println(s.solution(10, 9999)[i]);
        }
    }
}

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int k = 5;
        int start = -1; // 시작점을 -1로
        int end; // 끝점

        while(k<=r){  // r보다 작거나 같을때까지
            list.add(k); // k값 list에 넣어주기
            int firstSize = list.size();  // 밑에서 arr.add()를 하면 실시간으로 늘어나니 미리 변수로 빼기
            for(int i = 0; i < firstSize-1; i++) { // k*10값 전까지
                if (k + list.get(i) <= r) {  // k + arr에 속해있던 값들을 각각 더해서 <=r 보다 작으면
                    list.add(k + list.get(i));  // k + arr.get(i) 값 list에 넣어주기
                }
            }
            k*=10; // 다시 k*10해주기
        }

        for(int i = 0; i < list.size(); i++){
            if(l<=list.get(i)){  // l보다 크거나 같으면 그때의 i가 시작 index
                start = i;
                break;
            }
        }
        end = list.size() - 1; // 끝 index는 size()-1

        int[] answer = new int[end - start + 1]; // 끝index - 시작index + 1 '인덱스는 0부터 시작하므로'
        if(start==-1){  // 시작 index가 초기값 그대로면 범위안에 해당하는 숫자 없음
            answer = new int[] {-1};
        }else{
            for(int i = 0; i < answer.length; i++){
                answer[i]=list.get(start); // 시작index부터 끝index까지 값을 복사해줌
                start++;
            }
        }
        return answer;
    }
}