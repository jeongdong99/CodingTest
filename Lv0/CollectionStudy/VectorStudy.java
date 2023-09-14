import java.util.Enumeration;
import java.util.Vector;

public class VectorStudy {
    public static void main(String[] args) {
        Vector<String> v = new Vector<String>();
        v.add("aaa");  // "aaa" 추가, Collection 메서드
        v.addElement("bbb"); // "bbb" 추가, Vector 메서드
        v.addElement("ccc"); // "ccc" 추가
        v.remove("bbb"); // "bbb" 삭제

        // Vector에서만 적용할 수 있는 반복 처리 방법
        Enumeration<String> e = v.elements();
        while(e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
