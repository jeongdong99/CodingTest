public class ArrayPiece{
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
        int[] answer = {};

        for(int i = 0 ; i < query.length; i++) {  // query 배열 끝까지
            if(i%2 == 0) {   // 짝수면
                int[] temp = new int[query[i]+1]; // query[i]번 뒷부분을 자르면 남는 크기로 temp 배열을 만듬
                for(int j = 0; j < temp.length; j++){
                    temp[j] = arr[j];  // query[i]번 까지 복사
                }
                arr = temp; // temp는 지역 변수이므로 다른곳에서 쓸 수 없기에 arr에 얕은 복사
            }else{  // 홀수면
                int[] temp = new int[arr.length-(query[i])]; // query[i]번 앞부분을 자르면 남는 크기로 temp 배열 만듬
                for(int j = 0; j < temp.length ; j++){
                    temp[j] = arr[j+query[i]]; // query[i]번부터 끝까지 복사
                }
                arr = temp; // temp는 지역 변수이므로 다른곳에서 쓸 수 없기에 arr에 얕은 복사
            }
            answer = arr; // 정답은 arr
        }
        return answer;
    }
}