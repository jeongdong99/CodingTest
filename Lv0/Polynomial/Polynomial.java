
public class Polynomial{
    public static void main(String[] args) {
        Solution s = new Solution();
        String a = "x + 7";
        System.out.println(s.solution(a));
    }
}

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int xSum = 0;  // x값들의 합을 저장할 변수
        int sum = 0;   // 상수항들의 합을 저장할 변수

        String[] spl = polynomial.split(" \\+ "); // " + " 로 string 나누기
        for(int i = 0; i < spl.length; i++){
            if(spl[i].contains("x")){   // x를 포함하면 x를 없애기
                spl[i] = spl[i].replace("x","");
                if(spl[i].equals("")){  // 1x는 그냥 x로 표시되므로 x가 사라지면 빈값
                    xSum += 1;         // 1만 더해주기
                }
                else{xSum += Integer.valueOf(spl[i]);}  // x합에 더해주기
            }else{
                sum += Integer.valueOf(spl[i]); // x포함하지 않으면 그냥 상수합
            }
        }

        if(xSum != 0){  // xSum이 0이 아닐때
            answer += xSum == 1 ? "x" : xSum + "x";
            // 1이면 x만 출력 아니면 xSum x 출력
        }
        if(sum != 0){  //sum이 0이 아닐때
            answer += xSum != 0 ? " + " + sum : String.valueOf(sum);
            // xSum이 0이 아니면 + 붙이고 0이면 바로 숫자만 출력
        }
        return answer;
    }
}