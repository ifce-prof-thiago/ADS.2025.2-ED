package exercicios;

public class LoopSimples {
    // O(n)
    public static void main(String[] args) {
        int n = 10; // O(1)
        for (int i = 0; i < n; i++) { // O(n)
            System.out.println(i); // O(1)
        }
    }
}