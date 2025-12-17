import java.util.*;

public class ChaoticBinger {

    public static int longestStreak(int[] episodes) {
        HashSet<Integer> set = new HashSet<>();

        for (int ep : episodes) {
            set.add(ep);
        }

        int longest = 0;

        for (int ep : set) {
            // Start only if ep is the beginning of a sequence
            if (!set.contains(ep - 1)) {
                int current = ep;
                int streak = 1;

                while (set.contains(current + 1)) {
                    current++;
                    streak++;
                }

                longest = Math.max(longest, streak);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[][] testCases = {
            {100, 4, 200, 1, 3, 2},
            {1, 2, 3, 4, 5},
            {10, 5, 12, 3, 55, 30, 4, 11, 2},
            {8, 20, 7, 30},
            {1},
            {5, 4, 3, 2, 1, 0},
            {9, 1, 4, 7, 3, 2, 6, 8, 0},
            {50, 51, 52, 2, 3, 4, 100},
            {15, 14, 13, 12, 11},
            {1, 3, 5, 7}
        };

        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Test Case " + (i + 1) + ": " +
                    longestStreak(testCases[i]));
        }
    }
}
