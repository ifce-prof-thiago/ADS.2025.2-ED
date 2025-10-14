package cap04;

public class OperacoesPrimitivas {
    // Atribuição
    // Chamada de Métodos
    // Operações Aritméticas
    // Comparações entre dois números
    // Acesso a elementos de um array (por índice)
    // Retorno de um método
    // O(1)

    public static void main(String[] args) {
        int x  = soma(4, 5);
        int y = somaArray(new int[]{1, 2, 9});
    }

    public static int soma(int a, int b) {
        return a + b; // O(1)
    }

    public static int somaArray(int[] array) {
        int soma = 0; // O(1)
        for (int i = 0; i < array.length; i++) {  // O(n)
            soma += array[i]; // O(1)
        }
        return soma; // O(1)
    }
}
