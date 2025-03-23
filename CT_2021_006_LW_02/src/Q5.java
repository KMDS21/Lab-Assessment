import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner S5 = new Scanner(System.in);

        // Get temperature input from the user
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = S5.nextDouble();

        // Convert to Celsius
        double celsius = (5.0 / 9) * (fahrenheit - 32);

        // Display the result
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");

        S5.close();
    }
}
