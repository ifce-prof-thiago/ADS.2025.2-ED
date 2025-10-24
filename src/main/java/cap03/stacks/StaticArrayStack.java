package cap03.stacks;

public class StaticArrayStack implements Stack {
    private static final int CAPACITY = 10;
    private final String[] items;
    private int length;

    public StaticArrayStack() {
        items = new String[CAPACITY];
        length = 0;
    }

    @Override
    public void push(String element) {
        if (length == CAPACITY) {
            return;
        }
        items[length] = element;
        length++;
    }

    @Override
    public String pop() {
        if (length == 0) {
            return null;
        }
        final var temp = items[length - 1];
        items[length - 1] = null;
        length--;
        return temp;
    }

    @Override
    public String peek() {
        return items[length - 1];
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < length; i++) {
            s.append(" ").append(items[i]);
        }
        return s.toString();
    }
}
