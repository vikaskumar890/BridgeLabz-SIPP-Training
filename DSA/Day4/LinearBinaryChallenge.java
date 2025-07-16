package DSA.Day4;
import java.util.Arrays;

public class LinearBinaryChallenge {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1, 2, 5, 7};
        int target = 5;

        int max = Arrays.stream(arr).max().getAsInt();
        boolean[] seen = new boolean[max + 2];

        for (int num : arr) {
            if (num > 0 && num < seen.length) {
                seen[num] = true;
            }
        }

        int missing = -1;
        for (int i = 1; i < seen.length; i++) {
            if (!seen[i]) {
                missing = i;
                break;
            }
        }

        Arrays.sort(arr);
        int left = 0, right = arr.length - 1, index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("First missing positive: " + missing);
        System.out.println("Index of target (" + target + "): " + index);
    }
}

