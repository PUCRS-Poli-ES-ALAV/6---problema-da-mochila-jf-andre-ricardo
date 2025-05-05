public class Fibo {
    private int iterations;
    private long duration;

    public long fibo(int n) {
        iterations = 0;
        long startTime = System.nanoTime();
        long result = fiboIterative(n);
        long endTime = System.nanoTime();
        duration = endTime - startTime;
        return result;
    }

    private long fiboIterative(int n) {
        if (n <= 1) {
            return n;
        }
        long[] f = new long[n + 1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            iterations++;
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

    public int getIterations() {
        return iterations;
    }

    public long getDuration() {
        return duration;
    }

    public static void main(String[] args) {
        Fibo fib = new Fibo();
        int n = 10000;
        long result = fib.fibo(n);
        System.out.println("Fibonacci of " + n + " is: " + result);
        System.out.println("Iterations: " + fib.getIterations());
        System.out.println("Duration (ns): " + fib.getDuration());
    }
}