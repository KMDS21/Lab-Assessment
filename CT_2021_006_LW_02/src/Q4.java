import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner S4 = new Scanner(System.in);

        // Get weight input from the user
        System.out.print("Enter your weight : ");
        double bodyWeight = S4.nextDouble();

        // Calculate daily calorie needs
        double calories = bodyWeight * 19;

        // Display the result
        System.out.println("Your Weight is " + bodyWeight);
        System.out.println("You need approximately " + calories + " calories per day.");

        S4.close();
    }
}
