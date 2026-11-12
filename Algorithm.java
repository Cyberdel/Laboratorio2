import java.util.HashMap;
import java.util.Map;
import java.util.Random;
class AlgorithmB {

    // --- Strategy C: Frequency counting with HashMap ---
    // Prints metrics (in this case the duplicates found and their frequencies)
    public static void countFrequencies(int[] data) {
        long comparisons = 0; // Count/insert operations on the map
        Map<Integer, Integer> frequencies = new HashMap<>();

        // 1. Traverse the list only once O(n)
        for (int value : data) {
            comparisons++;
            // If it already exists, increment its counter; otherwise, initialize it to 1
            frequencies.put(value, frequencies.getOrDefault(value, 0) + 1);
        }

        // 2. Analyze results (find which values appear more than once)
        System.out.println("--- Frequency Results ---");
        System.out.println("Total operations (lookups/insertions): " + comparisons);

        int totalDuplicates = 0;
        for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            if (entry.getValue() > 1) {
                totalDuplicates++;
                // Optional: uncomment the line below to see each repeated number and how many times it appeared
                // System.out.println("The number " + entry.getKey() + " appears " + entry.getValue() + " times.");
            }
        }
        System.out.println(totalDuplicates + " distinct values were found that have duplicates.\n");
    }

    // Dataset generator for tests
    public static int[] generateDataset(int n) {
        Random rand = new Random(42);
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = rand.nextInt(n / 2); // Smaller range to force more repetitions
        }
        return data;
    }

    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000, 100000, 1000000};

        for (int n : sizes) {
            int[] data = generateDataset(n);
            System.out.println("Running for n = " + n);

            long start = System.nanoTime();
            countFrequencies(data);
            long end = System.nanoTime();

            double timeMs = (end - start) / 1_000_000.0;
            System.out.printf("Execution time: %.4f ms%n", timeMs);
            System.out.println("==================================================");
        }
    }
}