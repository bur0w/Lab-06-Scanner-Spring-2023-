import java.util.Scanner;

public class RectangleProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width;
        double height;
        boolean input;
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                input = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                input = false;
                scanner.next(); // consume invalid input
            }
        } while (!input);
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                input = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                input = false;
                scanner.next(); 
            }
        } while (!input);
        double area = width * height;
        System.out.println("The area of the rectangle is: " + area);
        double perimeter = 2 * (width + height);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        double diagonal = Math.sqrt(width * width + height * height);
        System.out.println("The length of the diagonal of the rectangle is: " + diagonal);
    }
}
