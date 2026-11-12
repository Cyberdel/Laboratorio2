import java.util.Random;

class AlgorithmA {

    static long operations = 0; // operations counter

    public static void main(String[] args) {
        int n = 100; // dataset size (then try 1000, 10000, etc.)

        // 1. Generate random dataset
        int[] data = generateDataset(n);

        // 2. Output structures (arrays of the same size as the original)
        int[] uniques = new int[n];
        int[] duplicates = new int[n];
        int uniqueCount = 0;
        int duplicateCount = 0;

        long start = System.nanoTime();

        // 3. Algorithm: traverse and compare against the uniques already stored
        for (int i = 0; i < n; i++) {
            operations++; // outer loop control
            boolean exists = false;

            for (int j = 0; j < uniqueCount; j++) {
                operations++; // inner loop control
                operations++; // comparison
                if (data[i] == uniques[j]) {
                    exists = true;
                    break;
                }
            }

            if (exists) {
                duplicates[duplicateCount++] = data[i];
            } else {
                uniques[uniqueCount++] = data[i];
            }
            operations++; // assignment to destination array
        }

        long end = System.nanoTime();

        // 4. Results
        System.out.println("n = " + n);
        System.out.println("Original dataset:");
        printArray(data, n);
        System.out.println("\nUniques (" + uniqueCount + "):");
        printArray(uniques, uniqueCount);
        System.out.println("\nDuplicates (" + duplicateCount + "):");
        printArray(duplicates, duplicateCount);

        System.out.println("\nOperations: " + operations);
        System.out.println("Time: " + (end - start) + " ns ("
                + (end - start) / 1_000_000.0 + " ms)");
    }

    static int[] generateDataset(int n) {
        Random rnd = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(n); // values between 0 and n-1 so duplicates appear
        }
        return arr;
    }

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}