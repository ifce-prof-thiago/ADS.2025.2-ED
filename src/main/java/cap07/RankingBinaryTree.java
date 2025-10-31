package cap07;

public class RankingBinaryTree {

    private Node<Player> root;

    public RankingBinaryTree() {
        root = null;
    }

    public void add(Player player) {
        root = insertRecursive(root, player);
    }

    private Node<Player> insertRecursive(Node<Player> current, Player player) {
        if (current == null) {
            return new Node<>(player);
        }
        if (player.score() < current.element.score()) {
            current.left = insertRecursive(current.left, player);
        } else {
            current.right = insertRecursive(current.right, player);
        }
        return current;
    }

    public void remove(Player player) {
        // TODO implementar a lógica de remoção
    }

    private static class Node<T> {
        T element;
        Node<T> left;
        Node<T> right;

        Node(T element) {
            this.element = element;
            this.left = null;
            this.right = null;
        }
    }
}
