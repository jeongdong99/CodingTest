public class GoodCode{
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        String code = "abc1abc1abc";
        System.out.println(s.solution(code));
    }
}

class Solution2 {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;
        for(int i = 0 ; i < code.length();i++){
            char ch = code.charAt(i);
            if(ch == '1'){
                mode = mode == 0 ? 1 : 0;
                continue;
            }
            if(i%2 == mode){
                answer.append(ch);
            }
        }
        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}