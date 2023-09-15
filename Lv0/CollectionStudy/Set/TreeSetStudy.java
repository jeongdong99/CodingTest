import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {
    public static void main(String[] args) {
        TreeSet<Man> set = new TreeSet<Man>();
        set.add(new Man("son",1));
        set.add(new Man("Kim",2));
        set.add(new Man("Ku",3));
        set.add(new Man("Sim",4));
        set.add(new Man("Kim",5)); // 내용 동일
        set.add(new Man("Kim",5)); // 내용 동일
        Iterator<Man> it = set.iterator(); // 출력
        while(it.hasNext()){
            System.out.print(it.next());
        }
    }
}
class Man implements Comparable{
    String name;
    int no;
    public Man(String name, int no){
        this.name = name;
        this.no = no;
    }
    public String toString() {
        return no + " ";
    }

    @Override
    public int compareTo(Object o) {
        return no - ((Man) o).no;
    }
}
