import java.util.*;
public class SpecialSort{
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numlist = {10000,20,36,47,40,6,10,7000};
        int n = 30;
        for(int i = 0; i < s.solution(numlist,n).length;i++){
            System.out.println(s.solution(numlist,n)[i]);
        }
    }
}

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int nearIndex = 0; // n값과 가장 가까운 값의 index
        int min = 10000;  // n값과 가장 가까운 값
        int k = 0; // 정답 배열에 넣기위한 변수

        Arrays.sort(numlist); // 오름차순 정리

        for(int i = 0; i < numlist.length;i++){
            if(min >= Math.abs(n-numlist[i])){  // 오름차순이니 차이가 같으면 뒤에 나온것이 우선 배치
                min = Math.abs(n-numlist[i]);
                nearIndex = i;
            }
        }
        answer[k++] = numlist[nearIndex]; // 가장 가까운 값 넣기

        int right = nearIndex + 1; // 오른쪽 진행
        int left = nearIndex - 1;  // 왼쪽 진행

        while(right < numlist.length && left >= 0){ // 끝지점에 다다를때 까지
            if(Math.abs(n-numlist[right]) <= Math.abs(n-numlist[left])){ // 왼쪽이 거리 더 크거나 같으면
                answer[k++] = numlist[right++]; // 복사 후 오른쪽 이동
            }else{
                answer[k++] = numlist[left--]; // 복사 후 왼쪽 이동
            }
        }

        if(right == numlist.length){ // 오른쪽이 끝지점이면
            while(left >= 0){  // 왼쪽 끝까지 복사
                answer[k++] = numlist[left--];
            }
        }else if (left < 0){  // 왼쪽이 끝지점이면
            while(right < numlist.length){ // 오른쪽 끝까지 복사
                answer[k++] = numlist[right++];
            }
        }
        return answer;
    }
}