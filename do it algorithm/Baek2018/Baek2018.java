import java.util.Scanner;
public class Baek2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum = 1;
        int start = 1;
        int end = 1;
        int cnt = 1;

        while(end != N ){
            if(sum > N){
                sum = sum - start;
                start++;
            }else if(sum < N){
                end++;
                sum = sum + end;
            }else{
                sum = sum - start;
                start++;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
