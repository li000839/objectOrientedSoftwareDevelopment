package Q4;

import java.util.Arrays;

public class VideoGame {
    public final String name;
    public final String platform;

    private static final VideoGame[] games = new VideoGame[100];
    private static int numGames = 0;

    public VideoGame(String name, String platform) {
        this.name = name;
        this.platform = platform;

        games[numGames++] = this;
    }

    public int compareTo(VideoGame other) {
        int platformCompare = platform.compareTo(other.platform);
        if (platformCompare != 0) {
            return platformCompare;
        } else {
            return name.compareTo(other.name);
        }
    }

    public static VideoGame[] getSortedVideoGames() {
        // Create a copy of the array to sort
        VideoGame[] sorted = Arrays.copyOf(games, games.length);

        // Recursively sort the array
        quickSort(sorted, 0, numGames - 1);
        return sorted;
    }

    private static void quickSort(VideoGame[] array, int low, int high) {
        if (low < high) {
            // Choose a pivot
            VideoGame pivot = array[high];

            // Partition the array
            int i = low;
            for (int j = low; j < high; ++j) {
                if (array[j].compareTo(pivot) > 0) {
                    // Swap the elements
                    VideoGame temp = array[i];
                    array[j] = array[i];
                    array[j] = temp;
                    ++i;
                }
            }

            // Swap the elements
            VideoGame temp = array[i];
            array[high] = array[i];
            array[i] = temp;

            quickSort(array, low, i - 1);
            quickSort(array, i + 1, high - 1);
        }
    }

    public String toString() {
        return String.format("%s (%s)", name, platform);
    }

    public static void main(String[] args) {
        new VideoGame("Halo", "Xbox");
        new VideoGame("Ocarina of Time", "Nintendo 64");
        new VideoGame("Red Dead Redemption 2", "Xbox One");
        new VideoGame("Majora's Mask", "Nintendo 64");

        System.out.println(Arrays.toString(VideoGame.getSortedVideoGames()));
    }
}
