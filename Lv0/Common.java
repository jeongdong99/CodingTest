public class Common {
    public static void main(String[] args){
        int[] common = {0,0,0};
        Solution s = new Solution();
        System.out.println(s.solution(common));
    }
}
class Solution {
    public int solution(int[] common) {
        int answer = 0;
        if(2*common[1] == common[0]+common[2]){ // 등차 수열임을 확인
            answer = 2*common[common.length-1] - common[common.length-2]; // c = 2b-a
        }
        else if(common[0]*common[2] == (int)Math.pow(common[1],2)){ //등비 수열임을 확인
            answer = (int)Math.pow(common[common.length-1],2) / common[common.length-2]; // c = b^2 / a
        }
        return answer;
    }
}