import java.util.Iterator;
import java.util.Vector;

public class IteratorStudy {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        v.add(4);
        v.add(5);
        v.add(6);
        Iterator<Integer> it = v.iterator();

        int sum = 0;
        int i ;
        while (it.hasNext()) {
            i = it.next();
            System.out.println(i);
            sum += i;
        }
        System.out.println("합은 : " + sum);
    }
}
