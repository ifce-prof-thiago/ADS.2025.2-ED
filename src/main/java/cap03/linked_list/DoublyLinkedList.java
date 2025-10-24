package cap03.linked_list;

public class DoublyLinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private long length;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public void addFirst(T element) {
        var f = first;
        var newNode = new Node<>(element, f, null);
        first = newNode;
        if (f == null) {
            last = newNode;
        } else {
            f.prev = newNode;
        }
        this.length++;
    }

    public T getFirst() {
        if (first == null) {
            return null;
        }
        return first.element;
    }

    public void addLast(T element) {
        var newNode = new Node<T>(element, null, last); // 1
        last.next = newNode; // 2
        last = newNode; // 3
        length++;
    }

    public void removeFirst() {
        if (first == null) {
            return;
        }
        var temp = first;
        first = first.next;
        temp.next = null;
        length--;
    }

    public void removeLast() {
        if (last == null) {
            return;
        }
        last = last.prev;
        last.next.prev = null;
        last.next = null;
    }

    public void print() {
        var temp = first;
        while (temp != null) {
            System.out.println(temp.element);
            temp = temp.next;
        }
    }

    public long length() {
        return length;
    }

    private static class Node<T> {
        final T element;
        Node<T> next;
        Node<T> prev;

        Node(T element, Node<T> next, Node<T> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        boolean hasNext() {
            return next != null;
        }
    }

}
