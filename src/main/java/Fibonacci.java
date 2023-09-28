public class Fibonacci {
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be >= 0");
        }
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
