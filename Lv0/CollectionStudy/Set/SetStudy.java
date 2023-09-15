import java.util.HashSet;
import java.util.Iterator;

public class SetStudy {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1); // 1 추가
        set.add(2); // 2 추가
        set.add(3); // 3 추가
        Iterator<Integer> it = set.iterator(); // 출력
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("사이즈 : "+ set.size()); // 사이즈 확인
        set.remove(1); // 1 삭제
        Iterator<Integer> it2 = set.iterator(); // 출력
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
        System.out.println(set.contains(2)); // 2 포함하는지 확인
        set.clear(); // 전체 삭제
        System.out.println(set.isEmpty()); // Set 비어있는지 확인
    }
}
