package DSA.Day1;
import java.util.*;

public class ZeroSumSubarrays {
    public static List<int[]> findSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();
        int sum = 0;
        map.put(0, new ArrayList<>(List.of(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    result.add(new int[]{start + 1, i});
                }
            }

            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, -4, -2, -2, 5, 2};
        List<int[]> subarrays = findSubarrays(arr);

        for (int[] range : subarrays) {
            System.out.println("Start: " + range[0] + ", End: " + range[1]);
        }
    }
}
