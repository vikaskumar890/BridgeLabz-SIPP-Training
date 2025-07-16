package DSA.Day3;
public class CountingSortStudentAges {
    public static void countingSort(int[] ages, int maxAge) {
        int[] count = new int[maxAge + 1];
        int[] output = new int[ages.length];

        for (int age : ages) {
            count[age]++;
        }

        for (int i = 1; i <= maxAge; i++) {
            count[i] += count[i - 1];
        }

        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i]] - 1] = ages[i];
            count[ages[i]]--;
        }

        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }

    public static void main(String[] args) {
        int[] ages = {13, 17, 12, 10, 14, 18, 13, 11};
        int maxAge = 18;
        countingSort(ages, maxAge);
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}

