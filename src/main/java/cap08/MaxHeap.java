package cap08;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap {
    private List<Integer> heap;

    public MaxHeap() {
        heap = new ArrayList<>();
    }

    public void add(Integer e) {
        heap.add(e);
        heapifyUp(heap.size() - 1);
    }

    private void heapifyUp(int i) {
        int parent = (i - 1) / 2;
        if (i > 0 && heap.get(i) > heap.get(parent)) {
            swap(i, parent);
            heapifyUp(parent);
        }
    }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

}
