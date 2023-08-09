public class Parallel {
    public static void main(String[] args){
        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        Solution s = new Solution();

        System.out.println(s.solution(dots));
    }
}
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;

        int k = 0;
        double[] inclination = new double[6];
        for(int i=0;i<dots.length;i++) {
            for(int j=i+1;j<dots.length;j++){
                inclination[k++] = (double)(dots[j][1]-dots[i][1])/(double) (dots[j][0]-dots[i][0])   ;
            }
        }

        for(int i=0;i<(inclination.length-1)/2;i++) {
                if(inclination[i] == inclination[inclination.length-1-i]){
                    answer = 1;
                    break;
                }
        }
        return answer;
    }
}