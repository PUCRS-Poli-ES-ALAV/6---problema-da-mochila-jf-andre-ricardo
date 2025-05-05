import java.util.ArrayList;

public class Mochila {
    private int iterations;

    public double maxBlocos(ArrayList<Bloco> list, double maxPeso) {
        iterations = 0;
        long startTime = System.nanoTime();
        double maxValor = bruteForce(list, maxPeso, 0, 0, 0);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("Tempo (ns): " + duration);
        System.out.println("Iteracoes totais: " + iterations);

        return maxValor;
    }

    private double bruteForce(ArrayList<Bloco> list, double maxPeso, int index, double currentPeso, double currentValor) {
        iterations++;
        if (index == list.size()) {
            return currentValor;
        }

        Bloco bloco = list.get(index);

        double exclude = bruteForce(list, maxPeso, index + 1, currentPeso, currentValor);

        double include = 0;
        if (currentPeso + bloco.peso <= maxPeso) {
            include = bruteForce(list, maxPeso, index + 1, currentPeso + bloco.peso, currentValor + bloco.valor);
        }

        return Math.max(exclude, include);
    }
}