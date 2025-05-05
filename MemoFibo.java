public class MemoFibo {
    private int iterations;
    private long duration;

    public long memoFibo(int n) {
        iterations = 0;
        long startTime = System.nanoTime();
        long[] f = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            f[i] = -1;
        }
        long result = lookupFibo(f, n);
        long endTime = System.nanoTime();
        duration = endTime - startTime;
        return result;
    }

    private long lookupFibo(long[] f, int n) {
        iterations++;
        if (f[n] >= 0) {
            return f[n];
        }
        if (n <= 1) {
            f[n] = n;
        } else {
            f[n] = lookupFibo(f, n - 1) + lookupFibo(f, n - 2);
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
        MemoFibo fib = new MemoFibo();
        int n = 10000;
        long result = fib.memoFibo(n);
        System.out.println("Fibonacci of " + n + " is: " + result);
        System.out.println("Iterations: " + fib.getIterations());
        System.out.println("Duration (ns): " + fib.getDuration());
    }
}