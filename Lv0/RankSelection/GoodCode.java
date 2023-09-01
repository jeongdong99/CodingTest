import java.util.*;
public class GoodCode{
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] rank = {3,7,2,5,4,6,1};
        boolean[] attendance = {false, true, true, true, true, false, false};
        System.out.println( s.solution(rank,attendance));
    }
}

class Solution2 {
    public int solution(int[] rank, boolean[] attendance) {

        PriorityQueue<Integer> que = new PriorityQueue<>((a, b) -> rank[a] - rank[b]);
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i])
                que.add(i);
        }

        return que.poll() * 10000 + que.poll() * 100 + que.poll();
    }
}