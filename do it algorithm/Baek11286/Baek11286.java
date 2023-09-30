import java.util.PriorityQueue;
import java.util.Scanner;

public class Baek11286{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((o1,o2)->{
            int firstNum = Math.abs(o1);
            int secondNum = Math.abs(o2);

            if(firstNum==secondNum){
                return o1 > o2 ? 1 : -1;
            }

           return firstNum-secondNum;
        });

        for(int i = 0; i < N; i++){
            int num = sc.nextInt();
            if(num==0){
                if(pq.isEmpty()){
                    sb.append("0\n");
                }else{
                    sb.append(pq.remove()+"\n");
                }
            }else{
                pq.add(num);
            }
        }
        System.out.println(sb.toString());
    }
}