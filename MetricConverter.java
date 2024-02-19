import java.util.Scanner;

public class MeterConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double meters;
        boolean input;
        do {
            System.out.print("Enter the measurement in meters: ");
            if (scanner.hasNextDouble()) {
                meters = scanner.nextDouble();
                input = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                input = false;
                scanner.next(); // consume invalid input
            }
        } while (!input);
        double miles = metersToMiles(meters);
        double feet = metersToFeet(meters);
        double inches = metersToInches(meters);
        System.out.println(meters + " meters is equal to:");
        System.out.println(miles + " miles");
        System.out.println(feet + " feet");
        System.out.println(inches + " inches");
    }

    public static double metersToMiles(double meters) {
        return meters * 0.000621371;
    }

    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double metersToInches(double meters) {
        return meters * 39.3701;
    }
}
