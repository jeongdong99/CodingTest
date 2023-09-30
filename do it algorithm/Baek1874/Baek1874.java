import java.util.Scanner;
import java.util.Stack;

public class Baek1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int arr[] = new int[len];
        for(int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        Stack<Integer> s = new Stack<Integer>();

        int increasingNum = 1;
        boolean result = true;
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < arr.length; i++) {
            int su = arr[i];
            if(su >= increasingNum) {
                while(su>=increasingNum){
                    s.push(increasingNum++);
                    sb.append("+\n");
                }
                s.pop();
                sb.append("-\n");
            }else{
                int n = s.pop();
                if(n > su){
                    System.out.println("NO");
                    result = false;
                    break;
                }else{
                    sb.append("-\n");
                }
            }
        }
        if(result) System.out.println(sb.toString());
    }
}
