import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gallonsOfGas;
        double fuelEfficiency;
        double pricePerGallon;
        boolean input;
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (scanner.hasNextDouble()) {
                gallonsOfGas = scanner.nextDouble();
                input = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                scanner.next(); 
            }
        } while (!validInput);
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (scanner.hasNextDouble()) {
                fuelEfficiency = scanner.nextDouble();
                input = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                input = false;
                scanner.next(); // consume invalid input
            }
        } while (!input);
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (scanner.hasNextDouble()) {
                pricePerGallon = scanner.nextDouble();
                input = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                scanner.next(); 
            }
        } while (!input);

        double costPer100Miles = (100 / fuelEfficiency) * pricePerGallon;
        System.out.println("The cost per 100 miles is: $" + costPer100Miles);
        double distance = gallonsOfGas * fuelEfficiency;
        System.out.println("The car can go approximately " + distance + " miles with the gas in the tank.");
    }
}
