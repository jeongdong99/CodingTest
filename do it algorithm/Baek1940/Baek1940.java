import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baek1940 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        int M = Integer.parseInt(bf.readLine());
        int[] arr = new int[N];
        StringTokenizer st =new StringTokenizer(bf.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int start_index = 0;
        int end_index = N-1;
        int cnt = 0;
        while(arr[start_index] < arr[end_index]){
            if(arr[start_index] +  arr[end_index] < M){
                start_index++;
            }else if(arr[start_index] +  arr[end_index] > M){
                end_index--;
            }else{
                start_index++;
                end_index--;
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
