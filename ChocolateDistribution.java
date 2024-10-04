import java.util.Arrays;

public class ChocolateDistribution {

    public static int findMinDifference(int[] chocolates, int n, int m) {
        // Edge cases
        if (m == 0 || n == 0) {
            return 0;
        }

        // If there are fewer packets than students
        if (n < m) {
            return -1;
        }

        // Sort the array to ensure the distribution is optimal
        Arrays.sort(chocolates);

        // Initialize the minimum difference to the maximum possible value
        int minDiff = Integer.MAX_VALUE;

        // Traverse the sorted array to find the minimum difference
        for (int i = 0; i + m - 1 < n; i++) {
            int diff = chocolates[i + m - 1] - chocolates[i];
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }

    public static void main(String[] args) {
        int[] chocolates = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40};
        int students = 7;
        int result = findMinDifference(chocolates, chocolates.length, students);

        if (result == -1) {
            System.out.println("Not enough chocolate packets.");
        } else {
            System.out.println("Minimum difference is: " + result);
        }
    }
}
