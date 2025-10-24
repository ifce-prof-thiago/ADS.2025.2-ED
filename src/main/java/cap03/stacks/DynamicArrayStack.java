package cap03.stacks;

import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArrayStack implements Stack {
    private int capacity = 100;
    private String[] items;
    private int length;

    public DynamicArrayStack() {
        items = new String[capacity];
        length = 0;
    }

    @Override
    public void push(String element) {
        if (length == capacity) {
            capacity = capacity + capacity / 2;
            items = Arrays.copyOf(items, capacity);
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
