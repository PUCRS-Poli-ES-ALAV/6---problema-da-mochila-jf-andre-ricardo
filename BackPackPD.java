import java.util.HashMap;
import java.util.Map;

public class BackPackPD {
    public int backPackPD(int N, int C, Map<Integer, int[]> itens) {
        int iterations = 0;
        long startTime = System.nanoTime();

        int[][] maxTab = new int[N + 1][C + 1];

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= C; j++) {
                maxTab[i][j] = 0;
                iterations++;
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= C; j++) {
                iterations++;
                if (itens.get(i)[0] <= j) {
                    maxTab[i][j] = Math.max(maxTab[i - 1][j],
                            itens.get(i)[1] +
                                    maxTab[i - 1][j - itens.get(i)[0]]);
                } else {
                    maxTab[i][j] = maxTab[i - 1][j];
                }
            }
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Iteracoes: " + iterations);
        System.out.println("Tempo (ns): " + duration);

        return maxTab[N][C];
    }
}