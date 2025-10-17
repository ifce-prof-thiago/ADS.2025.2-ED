package cap03.linked_list;

public class SLinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private long length;

    public SLinkedList() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public void addFirst(T element) {
        var temp = first;
        this.first = new Node<>(element, temp);
        this.length++;
        if(length == 1) {
            last = first;
        }
    }

    public void addLast(T element) {
        var temp = last;
        temp.next = new Node<T>(element, null);
        last = temp.next;
        length++;
    }

    public void removeFirst() {

    }

    public void removeLast(){

    }

    private static class Node<T> {
        final T element;
        Node<T> next;

        Node(T element, Node<T> next) {
            this.element = element;
            this.next = next;
        }

        boolean hasNext() {
            return next != null;
        }
    }

}
