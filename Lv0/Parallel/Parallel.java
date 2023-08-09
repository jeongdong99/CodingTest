public class Parallel {
    public static void main(String[] args){
        int[][] dots = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
        Solution s = new Solution();
        System.out.println((double)1/3);
        System.out.println(s.solution(dots));
    }
}
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        double[] inclination = new double[6]; // 기울기를 저장할 배열
        int k = 0;  // 기울기 배열에 증가값을 위한 변수

        for(int i=0;i<dots.length-1;i++) {
            for(int j=i+1;j<dots.length;j++){  // a-b, a-c, a-d, b-c, b-d, c-d 기울기 구해서 넣기
                inclination[k++] = (double)(dots[j][1]-dots[i][1]) / (dots[j][0]-dots[i][0]);
                // 기울기는 (y1-y0) / (x1-x0)
            }
        }

        for(int i=0;i<(inclination.length-1)/2;i++) {
            if(inclination[i] == inclination[inclination.length-1-i]){ // [a-b,c-d],[a-c,b-d],[a-d,b-c] 두 쌍 서로 비교
                answer = 1;
                break;
            }
        }
        return answer;
    }
}