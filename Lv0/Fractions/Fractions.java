
public class Fractions{
    public static void main(String[] args){
        Solution s = new Solution();

        System.out.println(s.solution(1,2,3,4)[0]);
        System.out.println(s.solution(1,2,3,4)[1]);
    }
}


class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int answerdenom = denom1 * denom2; // 분모끼리 곱하기 (d1 * d2)
        int answernumer = denom1 * numer2 + denom2 * numer1; // 분자끼리 더하기 (d1 * n2 + d2 * n1)
        int bigger = answerdenom > answernumer ? answerdenom : answernumer; // 큰값 구하기
        int smaller = answerdenom > answernumer ? answernumer : answerdenom; // 작은값 구하기

        int gcd = gcdfunc(bigger,smaller);  // 최대 공약수 구하기
        answer[0] = answernumer / gcd;     // (분자 / 최대 공약수)
        answer[1] = answerdenom / gcd;     // (분모 / 최대 공약수)

        return answer;
    }

    public int gcdfunc(int a, int b){  //최대 공약수 구하는 함수
        int remain;  // 나머지 값을 저장하는 변수
        while(b>0){  // 유클리드 호제법
            remain = a % b;
            a = b;
            b = remain;
        }
        if(b!=0){   // b가 0이 아니면 공약수가 없는 것
            return a = 1;
        }
        return a;
    }
}