package DSA.Day3;
public class InsertionSortEmployeeIDs {
    public static void main(String[] args) {
        int[] ids = {1023, 1005, 1010, 1001, 1042, 1030};
        int n = ids.length;

        for (int i = 1; i < n; i++) {
            int key = ids[i];
            int j = i - 1;

            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }
            ids[j + 1] = key;
        }

        for (int id : ids) {
            System.out.print(id + " ");
        }
    }
}
