import java.util.Arrays;
import java.util.Scanner;
public class Baek1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr =  new int[N];
        int sum = 0;

        for(int j = 0; j < arr.length; j++){
            arr[j] = sc.nextInt();
        }
        Arrays.sort(arr);

        for(int j = 0; j < arr.length; j++){
            sum += arr[j];
        }

        double avg = (double)sum * 100 / arr[N-1] / N;

        System.out.println(avg);
    }
}