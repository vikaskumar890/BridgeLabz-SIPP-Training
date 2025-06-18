import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3];
        String[] subjects = {"Physics", "Chemistry", "Maths"};

        int total = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double percentage = total / 3.0;
        String grade;
        String remark;

        if (percentage >= 90) {
            grade = "A+";
            remark = "Excellent";
        } else if (percentage >= 80) {
            grade = "A";
            remark = "Very Good";
        } else if (percentage >= 70) {
            grade = "B";
            remark = "Good";
        } else if (percentage >= 60) {
            grade = "C";
            remark = "Satisfactory";
        } else if (percentage >= 50) {
            grade = "D";
            remark = "Needs Improvement";
        } else {
            grade = "F";
            remark = "Fail";
        }

        System.out.printf("Average Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remark);
    }
}
