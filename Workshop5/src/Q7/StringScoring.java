package Q7;

public class StringScoring {
    private static final char[] letterScores =
            {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};

    public static int score(String word) {
        // Assumes well-formed input
        int sum = 0;
        for (char c : word.toCharArray()) {
            sum += letterScores[c - 'a'];
        }
        return sum;
    }
}
