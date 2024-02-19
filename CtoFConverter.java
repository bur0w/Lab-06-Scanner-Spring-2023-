import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
              boolean input; 
      double celsius;
        double fahrenheit;

        do {
            System.out.print("Enter the temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                input = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                scanner.next(); // consume invalid input
            }
        } while (!validInput);

        fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
