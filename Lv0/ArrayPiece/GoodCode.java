import java.util.Arrays;

public class GoodCode{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {01,2,3,4,5};
        int[] query = {4,1,2};
        for(int i = 0; i < s.solution(arr,query).length;i++){
            System.out.println(s.solution(arr,query)[i]);
        }
    }
}

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int start = 0;  // 시작점
        int end = arr.length - 1;  // 끝점
        for (int i = 0; i < query.length; i++) { // query 배열 끝까지
            if (i % 2 == 0) {  // 짝수면 뒷부분을 자른다
                end = start + query[i]; // 끝지점 = 시작점에서 query[i]번 인덱스까지
            } else {  // 홀수면 앞부분을 자른다
                start += query[i];  // 시작점 += query[i] 앞부분이 잘려서 0이 되었다가 다시 또 잘리므로 더하기
            }
        }

        return Arrays.copyOfRange(arr, start, end + 1); // arr을 start 인덱스부터 end + 1까지 복사
    }
}