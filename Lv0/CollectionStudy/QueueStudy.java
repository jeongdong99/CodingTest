import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Cat implements Comparable{
    int size;

    public Cat(int s){
        size = s;
    }

    public String toString(){
        return size + " ";
    }

    @Override
    public int compareTo(Object o) {
        return size - ((Cat) o).size;
    }
}

public class QueueStudy {
    public static void main(String[] args) {
        Queue<Cat> catPriorityQueue = new PriorityQueue<Cat>(3);
        catPriorityQueue.add(new Cat(5));
        catPriorityQueue.add(new Cat(3));
        catPriorityQueue.add(new Cat(7));

        System.out.println("Comparable 사용");
        System.out.println("크기 순");
        for(int i = 0; i < 3; i++) {
            Cat in = catPriorityQueue.poll();
            System.out.println("Processing Cat : " + in);
        }

        System.out.println();
        System.out.println("Comparator 사용");
        final Comparator<Cat> idComparator = new Comparator<Cat>(){
            public int compare(Cat c1, Cat c2) {
                return c2.size - c1.size;
            }
        };

        Queue<Cat> catPriorityQueue2 = new PriorityQueue<>(3,idComparator);
        catPriorityQueue2.add(new Cat(5));
        catPriorityQueue2.add(new Cat(3));
        catPriorityQueue2.add(new Cat(7));

        System.out.println("크기 역순");
        for(int i = 0; i < 3; i++) {
            Cat in = catPriorityQueue2.poll();
            System.out.println("Processing Cat : " + in);
        }
    }
}
