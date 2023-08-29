import java.util.ArrayList;

public class GoodCode{
    public static void main(String[] args) {
        Solution2 s = new Solution2();

        for(int i = 0; i < s.solution(10,9999).length;i++){
            System.out.println(s.solution(10, 9999)[i]);
        }
    }
}

class Solution2 {
    public int[] solution(int l, int r) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < 64; i++) {
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if (l <= num && num <= r)
                list.add(num);
        }
        return list.isEmpty() ? new int[] { -1 } : list.stream().mapToInt(i -> i).toArray();
    }
}