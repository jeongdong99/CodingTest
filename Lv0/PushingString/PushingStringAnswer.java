public class PushingStringAnswer{
    public static void main(String[] args) {
        Solution s = new Solution();
        String a = "hello";
        String b = "ohell";
        System.out.println(s.solution(a,b));

    }
}

class Solution {
    public int solution(String A, String B) {
        return (B + B).indexOf(A);
    }
}