import java.util.Random;

public class MarksGrades {

    public static int[][] generateMarks(int n) {
        Random rand = new Random();
        int[][] marks = new int[n][3];
        for (int i = 0; i < n; i++) {
            marks[i][0] = 50 + rand.nextInt(51); 
            marks[i][1] = 50 + rand.nextInt(51);
            marks[i][2] = 50 + rand.nextInt(51);
        }
        return marks;
    }

    public static double[][] calculateStats(int[][] marks) {
        int n = marks.length;
        double[][] stats = new double[n][3];
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }

    public static String[] calculateGrades(double[][] stats) {
        int n = stats.length;
        String[] grades = new String[n];
        for (int i = 0; i < n; i++) {
            double perc = stats[i][2];
            if (perc >= 90) grades[i] = "A+";
            else if (perc >= 80) grades[i] = "A";
            else if (perc >= 70) grades[i] = "B+";
            else if (perc >= 60) grades[i] = "B";
            else if (perc >= 50) grades[i] = "C";
            else grades[i] = "F";
        }
        return grades;
    }

    public static void displayScorecard(int[][] marks, double[][] stats, String[] grades) {
        System.out.printf("%-8s %-8s %-8s %-8s %-8s %-8s %-10s %-8s\n",
                "Student", "Physics", "Chem", "Maths", "Total", "Average", "Percentage", "Grade");
        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-8d %-8d %-8d %-8d %-8.0f %-8.2f %-10.2f %-8s\n",
                    i + 1,
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    stats[i][0],
                    stats[i][1],
                    stats[i][2],
                    grades[i]);
        }
    }

    public static void main(String[] args) {
        int students = 10;
        int[][] marks = generateMarks(students);
        double[][] stats = calculateStats(marks);
        String[] grades = calculateGrades(stats);
        displayScorecard(marks, stats, grades);
    }
}
