import java.util.Set;
import java.util.TreeMap;

public class TreeMapStudy {
    public static void main(String[] args) {
        TreeMap<String,String> mapT =  new TreeMap<String,String>();
        mapT.put("a","1");
        mapT.put("b","2");
        mapT.put("d","3");
        mapT.put("c","4");

        System.out.println("기본적으로 키값을 기준으로 정렬");
        for(Object s : mapT.keySet()) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("사용자 정의 클래스 키값을 기준으로 정렬");
        // Comparable or Comparator 구현
        TreeMap<Cat,String> trMap = new TreeMap<Cat,String>();
        trMap.put(new Cat(50),"Fat");
        trMap.put(new Cat(30),"Normal");
        trMap.put(new Cat(20),"Slim");

        Set<Cat> ks = trMap.keySet();

        for(Cat key : ks) {
                System.out.println(key + "==>" + trMap.get(key));
        }
    }
}
class Cat implements Comparable{
    int size;

    public Cat(int s){
        size = s;
    }

    public String toString(){
        return size + " ";
    }
    public int hashCode(){
        return size % 100;
    }

    public boolean equals(Object ob){
        Cat other = (Cat) ob;
        return other.size == this.size ? true : false;
    }

    @Override
    public int compareTo(Object o) {
        return size - ((Cat) o).size;
    }
}
