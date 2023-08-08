public class BabblingLv0 {
    public static void main(String[] args) {
    Solution solution = new Solution();
    String [] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        System.out.println(solution.solution(babbling));
    }
}
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] say = {"aya", "ye", "woo", "ma"}; // 말할 수 있는 단어들

        for (int i = 0; i < babbling.length; i++) { //입력된 단어들 순회
            for (int j = 0; j < say.length; j++) {
                if (babbling[i].contains(say[j])) { // 말할 수 있는 단어들 하나씩 검사
                    babbling[i] = babbling[i].replace(say[j], "X"); // 포함되면 X로 바꾸기
                }
            }
            babbling[i] = babbling[i].replaceAll("X","");
            if (babbling[i].equals("")){ // 마지막 남은게 공백이면 말할 수 있는 단어
                answer++;
            }
        }

        return answer;
    }
}