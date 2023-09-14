import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListStudy {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(5); // 목적에 맞게 사이즈 설정
        list.add("111"); // [0]인덱스에 "111" 추가
        list.add("222"); // [1]인덱스에 "222" 추가
        list.add(1, "333"); // [1] 인덱스에 "333" 추가 후 기존에 있던것은 한칸 뒤로
        list.add("444");

        System.out.println("구성 데이터 : " + list);

        // 데이터 위치 파악
        int pos = list.indexOf("222");
        System.out.println("222의 위치는 :" + pos);

        // ArrayList가 비어 있는지, 데이터 포함 여부 검사
        boolean check1 = list.isEmpty();
        boolean check2 = list.contains("444");

        System.out.println("비어 있음 : " + check1 + " 포함 여부 : " + check2);

        // 데이터 개수
        int size = list.size();
        System.out.println("리스트의 크기 :" + size);

        // 특정 위치 데이터 구하기
        String item = list.get(2);
        System.out.println("2번째 위치 데이터 : " + item);
        System.out.println();
        // 데이터 반복 처리 - 첫 번째 방법
        System.out.println("데이터 반복 처리 - 첫 번째 방법");

        for (int i = 0; i < list.size(); i++){
            System.out.println("Index: " + i + " - Item: " + list.get(i));
        }
        System.out.println();
        // 데이터 반복 처리 - 두 번째 방법
        System.out.println("데이터 반복 처리 - 두 번째 방법");

        for (String str : list){
            System.out.println("Item is: " + str);
        }
        System.out.println();
        // 데이터 반복 처리 - 세 번째 방법
        System.out.println("데이터 반복 처리 - 세 번째 방법");
        for (Iterator<String> it = list.iterator(); it.hasNext();) {
            System.out.println("데이터 :" + it.next());
        }
        System.out.println();
        // 데이터 수정
        list.set(1,"888");
        System.out.println("수정 후 :" + list);

        // 지정 위치 데이터 제거, 데이터로 저장되어 있는 첫 요소 제거
        list.remove(0);
        list.remove("444");
        System.out.println("리스트의 최종 내용 : " + list);

        // Arraylist를 Array로 변환
        String[] arr = list.toArray(new String[list.size()]);
        System.out.println("변환 배열 : " + Arrays.toString(arr));
    }
}