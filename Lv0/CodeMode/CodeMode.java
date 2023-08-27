public class CodeMode{
    public static void main(String[] args) {
        Solution s = new Solution();
        String code = "abc1abc1abc";
            System.out.println(s.solution(code));
    }
}

class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        String ret = "";
        for(int i = 0; i < code.length(); i++){
            if(mode == 0){  // mode가 0일때
                if(code.charAt(i)=='1'){ // 1이면 mode 바꾸기
                    mode = 1;
                }else{
                    if(i%2==0){  // 짝수면
                        ret += code.charAt(i);
                    }
                }
            }else{  // mode가 1일때
                if(code.charAt(i)=='1'){
                    mode = 0;
                }else{
                    if(i%2!=0){ // 홀수면
                        ret += code.charAt(i);
                    }
                }
            }
        }
        if(ret.equals("")){ // 빈 값이면
            ret = "EMPTY";
        }
        answer = ret;
        return answer;
    }
}