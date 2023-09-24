import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf =
                new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] S = new long[N + 1];
        st = new StringTokenizer(bf.readLine());
        for(int i = 1; i <= N; i++) {
            S[i] = S[i-1] + Integer.parseInt(st.nextToken());
        }
        for(int k =0; k < M; k++) {
            st = new StringTokenizer(bf.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            System.out.println(S[end] - S[start-1]);
        }
    }
}
