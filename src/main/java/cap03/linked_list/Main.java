package cap03.linked_list;

import cap03.Player;

public class Main {
    public static void main(String[] args) {
       SLinkedList list = new SLinkedList();
        list.addFirst(new Player("Nic", 800));
        list.addFirst(new Player("Alex", 40));

    }
}
