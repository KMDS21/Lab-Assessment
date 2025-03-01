package Q9;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner S1 = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String E1 = S1.nextLine();

        S1.close();

        int length = E1.length();

        if (length> 0) {
            char firstChar = E1.charAt(0);
            char lastChar = E1.charAt(length - 1);

            System.out.println(length);
            System.out.println(firstChar);
            System.out.println(lastChar);
        } else {
            System.out.println("Error: Empty string entered.");
        }

    }
}
