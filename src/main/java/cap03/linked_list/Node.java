package cap03.linked_list;

public class Node<T> {
    private final T element;
    private Node<T> next;

    public Node(T element) {
        this.element = element;
    }

    public void changeNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> next() {
        return next;
    }

    public T element() {
        return element;
    }
}
