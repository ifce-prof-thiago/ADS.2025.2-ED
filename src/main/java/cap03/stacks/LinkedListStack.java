package cap03.stacks;

import cap03.linked_list.DoublyLinkedList;

public class LinkedListStack implements Stack {

    private DoublyLinkedList<String> items;

    public LinkedListStack() {
        items = new DoublyLinkedList<>();
    }

    @Override
    public void push(String element) {
        items.addFirst(element);
    }

    @Override
    public String pop() {
        var temp = items.getFirst();
        items.removeFirst();
        return temp;
    }

    @Override
    public String peek() {
        return items.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return items.length() == 0;
    }
}
