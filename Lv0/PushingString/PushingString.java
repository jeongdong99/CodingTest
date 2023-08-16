public class PushingString{
    public static void main(String[] args) {
        Solution s = new Solution();
        String a = "hello";
        String b = "ohell";
        System.out.println(s.solution(a,b));

    }
}

class Solution {
    public int solution(String A, String B) {
        int answer = 0;

        char[] arrA = A.toCharArray(); // A를 문자 배열로 변경
        char[] arrB = B.toCharArray(); // B를 문자 배열로 변경
        char[] temp = new char[arrA.length]; // 빈 문자 배열 생성

        if(arrA.length == arrB.length){  // arrA 와 arrB가 같으면
            for(int i = 0; i < arrA.length;i++){  // 밀어버릴 횟수
                for(int j = 0; j < arrA.length; j++){  // 배열 순차적으로 복사
                    temp[(j+i)%arrA.length] = arrA[j]; // 오른쪽으로 i만큼 밀어버리는 규칙
                }
                A = String.valueOf(temp); // A 문자 배열을 다시 문자열로
                B = String.valueOf(arrB); // B 문자 배열을 다시 문자열로

                if(A.equals(B)){ // A와 B가 같으면
                    answer = i; // 당시 i만큼 밀어버린게 정답
                    return answer;
                }
                if(i==arrA.length-1){ // i가 끝까지 돌아도 A와 B가 같지 않으면
                    answer = -1;
                    return answer;
                }
            }
        }else{  // 초기에 A와 B의 길이가 다르면 같아질 수가 없다
            answer = -1;
            return answer;
        }
        return answer;
    }
}
