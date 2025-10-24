package cap03.linked_list;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.addFirst("A");
        list.addFirst("B");
        list.addLast("C");
        list.addFirst("D");
        list.addLast("E");
        list.removeLast();
        list.print();

    }
}
