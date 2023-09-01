
import java.util.*;
public class RankSelection{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] rank = {3,7,2,5,4,6,1};
        boolean[] attendance = {false, true, true, true, true, false, false};
        System.out.println( s.solution(rank,attendance));
    }
}

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int answer = 0;

        for(int i = 0; i < rank.length;i++){
            if(attendance[i]){ // true면
                arr.add(i); // index값을 넣어줌
            }
        }

        int[][] rankArray = new int[arr.size()][arr.size()]; // 2차원 배열만듬

        for(int i = 0 ; i < arr.size();i++){
            rankArray[i][0] = rank[arr.get(i)]; // 등수(rank)를 등록
            rankArray[i][1] = arr.get(i); // 번수를 등록
        }
        Arrays.sort(rankArray, (o1, o2) -> {
            return o1[0]-o2[0]; // 첫번째 숫자 기준 오름차순 정리
        });

        answer = 10000  * rankArray[0][1]  + 100 * rankArray[1][1] + rankArray[2][1];

        return answer;
    }
}