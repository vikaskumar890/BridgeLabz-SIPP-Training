import java.util.Scanner;

public class TrigonometryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] angle = new double[1];

        System.out.print("Enter angle in degrees: ");
        angle[0] = sc.nextDouble();

        double[] result = calculateTrigonometricFunctions(angle[0]);

        System.out.printf("Sine: %.4f\nCosine: %.4f\nTangent: %.4f\n",
                result[0], result[1], result[2]);
    }

    public static double[] calculateTrigonometricFunctions(double degree) {
        double radians = Math.toRadians(degree);
        return new double[]{
                Math.sin(radians),
                Math.cos(radians),
                Math.tan(radians)
        };
    }
}
