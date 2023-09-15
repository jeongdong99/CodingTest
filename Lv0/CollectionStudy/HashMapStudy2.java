import java.util.HashMap;

public class HashMapStudy2 {
    public static void main(String[] args) {
        HashMap mapH = new HashMap();

        mapH.put(new Cat(50), "1");
        mapH.put(new Cat(30), "2");
        mapH.put(new Cat(20), "3");
        mapH.put(new Cat(60), "4");

        for(Object o : mapH.keySet()){
            System.out.println(mapH.get(o));
        }
    }
}
