package cap03.linked_list;

import cap03.Player;

public class SLinkedList {
    private Node<Player> head;
    private long length;

    public SLinkedList() {
        this.head = null;
        this.length = 0;
    }

    public void addFirst(Player player) {
        Node<Player> temp = head;
        Node<Player> newNode = new Node<>(player);
        newNode.changeNext(temp);
        this.head = newNode;
        this.length++;
    }

    public void addLast(Player player) {

    }

    public Node<Player> head() {
        return head;
    }

}
