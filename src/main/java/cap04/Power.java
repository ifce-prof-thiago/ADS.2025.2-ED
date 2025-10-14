package cap04;

public class Power {

    public static void main(String[] args) {
        var p = new Power();
        System.out.println(p.power2(2, 10000));
    }
    // O(n)
    public double power(double x, int n) {
        if (n == 0 || n == 1) // O(1)
            return 1; // (O(1)
        return x * power(x, n - 1); // O(n)
    }

    // O(log n)
    public double power2(double x, int n) {
        if (n == 0) // O(1)
            return 1; // O(1)
        if (n % 2 == 0) // O(1)
            return Math.pow(power2(x, n / 2), 2); // O(log n)
        return x * Math.pow(power2(x, (n - 1) / 2), 2); // O(log n)
    }
}
