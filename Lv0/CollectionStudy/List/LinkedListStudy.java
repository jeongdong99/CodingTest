import java.util.LinkedList;

public class LinkedListStudy {
    public static void main(String[] args) {

        // Stack 관련
        LinkedList<String> stack = new LinkedList<>();
        stack.push("aaa");
        stack.push("bbb");
        System.out.println("Stack :" + stack);
        String s = stack.pop();
        System.out.println(s+"가 팝업됨");
        System.out.println("Stack :" + stack);
        System.out.println();
        // Queue 관련
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("ccc");
        queue.offer("ddd");
        System.out.println("Queue :" + queue);
        String ss = queue.poll();
        System.out.println(ss + "가 반환 및 제거");
        System.out.println("Queue :" + queue);
        System.out.println();
        // 임의 위치의 데이터 조작
        LinkedList<String> list = new LinkedList<String>();
        list.add("aaa");
        list.add("fff");
        list.add(0,"ggg");
        System.out.println("List : " + list);
        String sss = list.remove(1);
        System.out.println(sss+"가 제거됨");
        String t = list.get(1);
        System.out.println("인덱스 1 위치의 값은 : " + t);
        System.out.println("List : " + list);
    }
}
