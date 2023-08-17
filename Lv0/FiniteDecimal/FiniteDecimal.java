public class FiniteDecimal{
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(7,22));
    }
}

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        b =  b / gcd(a, b); //분모를 최대공약수로 나눠 기약분수형태의 분모로 바꿔줌

        while ( b % 5 == 0) { // 5로 나눈 나머지가 0이면 5의 배수
            b /= 5; // 5로 나눈 수를 b에 다시 대입
        }
        while (b % 2 == 0) { // 2로 나눈 나머지가 0이면 2의 배수
            b /= 2; // 2로 나눈 수를 b에 다시 대입
        }
        if (b==1) { // b가 1이면 소인수가 2,5만 존재한다는 뜻
            answer = 1;
        } else {  // b가 1이 아닌 다른 수면 소인수가 2,5외에도 있다는 뜻
            answer = 2;
        }
        return answer;
    }
    public int gcd(int a,int b) { // 최대공약수 구하는 유클리드 호제법
        while (b > 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}