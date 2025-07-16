package DSA.Day3;
public class SelectionSortExamScores {
    public static void main(String[] args) {
        int[] scores = {76, 88, 45, 92, 67, 59};
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = scores[minIdx];
            scores[minIdx] = scores[i];
            scores[i] = temp;
        }

        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}

