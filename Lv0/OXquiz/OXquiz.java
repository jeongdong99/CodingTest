public class OXquiz{
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] arr = {"3 - 4 = -3","5 + 6 = 11"};
        for(int i = 0; i < arr.length; i++){
            System.out.println(s.solution(arr)[i]);
        }
    }
}

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];  // 답변 배열은 퀴즈만큼의 길이

        for(int i = 0 ; i < quiz.length;i++){
            String[] formula = quiz[i].split(" "); // 공백을 기준으로 수식을 자르기

            if(formula[1].equals("+")){  // 기호 부분에 해당하는 것이 +면
                if(Integer.valueOf(formula[0])+Integer.valueOf(formula[2]) == Integer.valueOf(formula[4])){
                    // String을 int로 바꿔 a+b = c 검사
                    answer[i] = "O"; // 맞으면 O
                }else{
                    answer[i] = "X"; // 틀리면 X
                }
            }else if(formula[1].equals("-")){ // 기호 부분에 해당하는 것이 -면
                if(Integer.valueOf(formula[0])-Integer.valueOf(formula[2]) == Integer.valueOf(formula[4])){
                    // String을 int로 바꿔 a-b = c 검사
                    answer[i] = "O"; // 맞으면 O
                }else{
                    answer[i] = "X";  // 틀리면 X
                }
            }
        }
        return answer;
    }
}