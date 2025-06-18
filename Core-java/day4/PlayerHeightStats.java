import java.util.Arrays;

public class PlayerHeightStats {
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 101) + 150; // 150–250
        }
        return heights;
    }

    public static int sum(int[] arr) {
        int s = 0;
        for (int i : arr) s += i;
        return s;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i : arr) if (i < min) min = i;
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i : arr) if (i > max) max = i;
        return max;
    }

    public static double mean(int[] arr) {
        return sum(arr) / (double) arr.length;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights(11);
        System.out.println("Player Heights (cm): " + Arrays.toString(heights));

        System.out.println("Shortest: " + min(heights) + " cm");
        System.out.println("Tallest: " + max(heights) + " cm");
        System.out.printf("Mean Height: %.2f cm\n", mean(heights));
    }
}
