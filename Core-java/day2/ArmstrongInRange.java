public class ArmstrongInRange {
    public static void main(String[] args) {

        for (int number = 1; number <= 1000; number++) {
            int originalNumber = number;
            int sum = 0;
            int n = String.valueOf(number).length();
            int temp = number;

            while (temp != 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, n);
                temp /= 10;
            }

            if (sum == originalNumber) {
                System.out.println(originalNumber);
            }
        }
    }
}
