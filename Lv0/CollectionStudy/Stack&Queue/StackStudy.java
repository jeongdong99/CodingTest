import java.util.Stack;

public class StackStudy {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push("aaa");

        // peek 메서드 (제거 X)
        String s = (String) st.peek();
        if(st.empty()) {
            System.out.println(s+"가 peek된 후 스택이 비었습니다.");
        }

        // pop 메서드 (제거 O)
        s = (String) st.pop();
        if(st.empty()) {
            System.out.println(s+"가 pop된 후 스택이 비었습니다.");
        }

        st.push("bbb");
        st.push("ccc");
        System.out.println(st.search("bbb"));
        System.out.println(st.search("ccc"));
    }
}
