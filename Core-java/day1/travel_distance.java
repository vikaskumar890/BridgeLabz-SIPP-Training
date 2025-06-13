import java.util.Scanner;
public class Q17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter From City: ");
        String fromCity = input.nextLine();
        System.out.print("Enter Via City: ");
        String viaCity = input.nextLine();
        System.out.print("Enter To City: ");
        String toCity = input.nextLine();

        System.out.print("Enter distance from From City to Via City (miles): ");
        double fromToVia = input.nextDouble();
        System.out.print("Enter distance from Via City to Final City (miles): ");
        double viaToFinalCity = input.nextDouble();

        System.out.print("Enter time from From City to Via City (minutes): ");
        double timeFromToVia = input.nextDouble();
        System.out.print("Enter time from Via City to Final City (minutes): ");
        double timeViaToFinalCity = input.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;
        double totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km and the Total Time taken is " + totalTime + " minutes");
    }
}
