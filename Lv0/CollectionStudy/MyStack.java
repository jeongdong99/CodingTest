class Stack<T>{
    final int size;
    T[] items;
    int top;

    public Stack() {this(10);}
    public Stack(int s) {
        size = s > 0 ? s : 10;
        items = (T []) new Object[s];
        top = -1;
    }
    public void Push(T item) {
        if(top == size -1) throw new FullException();
        items[++top] = item;
    }
    public T Pop() {
        if(top == -1) throw new EmptyException();
        return items[top--];
    }
}

class FullException extends RuntimeException {
    public FullException(){
        System.out.println("Stack overflow");
    }
}

class EmptyException extends RuntimeException {
    public EmptyException(){
        System.out.println("Stack is empty");
    }
}

public class MyStack{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.Push(123);
        int x = stack.Pop();
        System.out.println(x);
        stack.Pop();
    }
}