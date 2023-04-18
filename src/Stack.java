import java.util.EmptyStackException;

public class Stack<T> {
    Node<T> head;

    public boolean isEmpty() {
        return head == null;
    }

    public void push(T value) {
        head = new Node<T>(value, head);
    }

    public T pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = head.getValue();
        head = head.getPrev();
        return value;
    }
}
