import java.util.Scanner;

public class TravelDetails {
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

        System.out.print("Enter distance from From City to Via City (in miles): ");
        double fromToVia = input.nextDouble();

        System.out.print("Enter distance from Via City to Final City (in miles): ");
        double viaToFinalCity = input.nextDouble();

        System.out.print("Enter time from From City to Via City (in minutes): ");
        double timeFromToVia = input.nextDouble();

        System.out.print("Enter time from Via City to Final City (in minutes): ");
        double timeViaToFinalCity = input.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;
        double totalTime = timeFromToVia + timeViaToFinalCity;

    
        System.out.println("The total distance travelled by " + name + " from " + fromCity + " to " + toCity +
                " via " + viaCity + " is " + totalDistance + " miles and the total time taken is " + totalTime + " minutes.");
    }
}
