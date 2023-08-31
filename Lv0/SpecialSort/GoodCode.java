
public class GoodCode{
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] numlist = {10000,20,36,47,40,6,10,7000};
        int n = 30;
        for(int i = 0; i < s.solution(numlist,n).length;i++){
            System.out.println(s.solution(numlist,n)[i]);
        }
    }
}

class Solution2 {
    public int[] solution(int[] numlist, int n) {

        int size = numlist.length;
        for(int i=0; i<size-1; i++){
            for(int k=i+1; k<size; k++){
                int a = (numlist[i] - n) * (numlist[i] > n ? 1 : -1);
                int b = (numlist[k] - n) * (numlist[k] > n ? 1 : -1);
                if(a > b || (a == b && numlist[i] < numlist[k])){
                    int temp = numlist[i];
                    numlist[i] = numlist[k];
                    numlist[k] = temp;
                }

            }
        }
        return numlist;
    }
}