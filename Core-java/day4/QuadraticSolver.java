import java.util.Scanner;

public class QuadraticSolver {
    public static double[] findRoots(int a, int b, int c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            return new double[0]; // No real roots
        } else if (delta == 0) {
            double root = -b / (2.0 * a);
            return new double[]{root};
        } else {
            double root1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            return new double[]{root1, root2};
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] coeff = new int[3];

        System.out.print("Enter coefficient a: ");
        coeff[0] = sc.nextInt();
        System.out.print("Enter coefficient b: ");
        coeff[1] = sc.nextInt();
        System.out.print("Enter coefficient c: ");
        coeff[2] = sc.nextInt();

        double[] roots = findRoots(coeff[0], coeff[1], coeff[2]);

        if (roots.length == 0) {
            System.out.println("No real roots.");
        } else if (roots.length == 1) {
            System.out.println("One root: " + roots[0]);
        } else {
            System.out.println("Two roots: " + roots[0] + " and " + roots[1]);
        }
    }
}
