public class PlusFractions{
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(1,2,3,4));
    }
}

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int answerdenom = denom1 * denom2; // 분모끼리 곱하기 (d1 * d2)
        int answernumer = denom1 * numer2 + denom2 * numer1; // 분자끼리 더하기 (d1 * n2 + d2 * n1)

        int gcd = gcdfunc(answernumer,answerdenom);  // 최대 공약수 구하기
        answer[0] = answernumer / gcd;     // (분자 / 최대 공약수)
        answer[1] = answerdenom / gcd;     // (분모 / 최대 공약수)

        return answer;
    }

    public int gcdfunc(int a,int b) { // 최대공약수 구하는 유클리드 호제법
        while (b > 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
