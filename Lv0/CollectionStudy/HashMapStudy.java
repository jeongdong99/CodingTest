import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapStudy {
    public static void main(String[] args) {
        HashMap<String,String> mapH = new HashMap<String,String>(); // 타입 지정
        // HashMap mapH = new HashMap(); // 디폴트는 Object타입의 키와 값

        // 요소 추가
        mapH.put("키1","값1");
        mapH.put("키2","값2");
        mapH.put("키3","값3");
        // 요소 접근
        System.out.print("키1 값에 접근 : ");
        System.out.println((String)mapH.get("키1"));
        mapH.put("키1","값4"); // 동일한 키로 저장하면 값을 덮어버린다.
        System.out.print("키1 값에 접근 : ");
        System.out.println((String)mapH.get("키1"));

        // 반복 처리1
        System.out.println("반복 처리1");
        Iterator iterator = mapH.keySet().iterator();

        while(iterator.hasNext()){
            Object key = iterator.next();
            Object value = mapH.get(key);
            System.out.println(key +" "+ value);
        }

        // 요소 제거
        mapH.remove("키2");

        // 반복 처리2
        System.out.println("반복 처리2");
        for(Object key : mapH.keySet()){
            Object value = mapH.get(key);
            System.out.println(key +" "+ value);
        }

        // 반복 처리3
        System.out.println("반복 처리3");
        for(Map.Entry<String,String> entry : mapH.entrySet()){
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println(key +" "+ value);
        }
    }
}
