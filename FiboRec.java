public class FiboRec {
    private int iterations;
    private long duration;

    public int fiboRec(int n) {
        iterations = 0;
        long startTime = System.nanoTime();
        int result = fiboRecHelper(n);
        long endTime = System.nanoTime();
        duration = endTime - startTime;
        return result;
    }

    private int fiboRecHelper(int n) {
        iterations++;
        if (n <= 1) {
            return n;
        } else {
            int a = fiboRecHelper(n - 1);
            int b = fiboRecHelper(n - 2);
            return a + b;
        }
    }

    public int getIterations() {
        return iterations;
    }

    public long getDuration() {
        return duration;
    }

    public static void main(String[] args) {
        FiboRec fib = new FiboRec();
        int n = 32;
        int result = fib.fiboRec(n);
        System.out.println("Fibonacci of " + n + " is: " + result);
        System.out.println("Iterations: " + fib.getIterations());
        System.out.println("Duration (ns): " + fib.getDuration());
    }
}