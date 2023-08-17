public class Mode{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = {1,2,3,3,3,4};
        System.out.println(s.solution(array));
    }
}

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] cntArr = new int[1000]; // 나오는 횟수가 저장될 배열
        int cntMax = 0;  // 최빈값 나온 횟수를 저장할 변수

        for(int i = 0; i < array.length; i++){
            cntArr[array[i]]++;   // array 배열안에 숫자를 cntArr의 인덱스로 생각해서 값+1 해준다.
        }
        for(int i = 0; i < cntArr.length; i++){
            if(cntArr[i]>cntMax){ // 횟수 배열안에 값이 cntMax보다 크면
                answer = i; // i가 최빈값
                cntMax = cntArr[i];  // cntMax는 i일때 횟수 배열의 값
            }else if(cntArr[i]==cntMax){ // 횟수 배열의 값과 이전 최빈값 출현 횟수가 같으면
                answer = -1; // 최빈값이 2개 이상이므로 -1
            }
        }
        return answer;
    }
}