import java.util.*;
import java.io.*;
public class Baek2503 {
    public static void main(String[] args) throws IOException {
        List<String> answerList = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 100; i < 1000; i++){
            answerList.add(String.valueOf(i));
        }

        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String request = st.nextToken();
            int strike = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());
            for (int j = 100; j < 1000; j++) {
                String strj = String.valueOf(j);
                int strikeCnt = 0;
                int ballCnt = 0;
                if(strj.charAt(0)==strj.charAt(1)||strj.charAt(0)==strj.charAt(2)||strj.charAt(1)==strj.charAt(2)){
                    answerList.remove(strj);
                    continue;
                }if(strj.charAt(0)=='0'||strj.charAt(1)=='0'||strj.charAt(2)=='0'){
                    answerList.remove(strj);
                    continue;
                }
                if (request.charAt(0) == strj.charAt(0)) {
                    strikeCnt++;
                }else if (request.contains(String.valueOf(strj.charAt(0)))) {
                    ballCnt++;
                }
                if (request.charAt(1) == strj.charAt(1)) {
                    strikeCnt++;
                }else if (request.contains(String.valueOf(strj.charAt(1)))) {
                    ballCnt++;
                }if (request.charAt(2) == strj.charAt(2)) {
                    strikeCnt++;
                } else if (request.contains(String.valueOf(strj.charAt(2)))) {
                    ballCnt++;
                }
                if (strikeCnt != strike || ballCnt != ball) {
                    answerList.remove(strj);
                }
            }
        }
        System.out.println(answerList.size());
    }
}
