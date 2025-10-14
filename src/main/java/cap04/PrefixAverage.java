package cap04;

public class PrefixAverage {
    public static void main(String[] args) {
        int [] x = new int[100];
        for(int i = 0; i < x.length; i++) {
            x[i] = i + 1;
        }
        var pa = new PrefixAverage();
        pa.prefixAverage1(x);
    }
    // O(n²)
    public double[] prefixAverage1(int[] x) {
        double[] a = new double[x.length]; // O(1)
        for (int i = 0; i < x.length; i++) { // O(n)
            int soma = 0; // O(1)
            for (int j = 0; j <= i; j++) { // O(n)
                soma += x[j]; // O(1)
            }
            a[i] = (double) soma / (i + 1); // O(1)
        }
        return a; // O(1)
    }

    // O(n)
    public double[] prefixAverage2(int[] x) {
        double[] a = new double[x.length]; // O(1)
        int soma = 0; // O(1)
        for (int i = 0; i < x.length; i++) { // O(n)
            a[i] = (soma + x[i]) / (i + 1.0); // O(1)
            soma += x[i]; // O(1)
        }
        return a; // O(1)
    }
}
