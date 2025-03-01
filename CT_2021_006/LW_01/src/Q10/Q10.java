package Q10;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner S1 = new Scanner(System.in);

        System.out.print("Enter a word :");
        String W1 = S1.nextLine();

        S1.close();
        int length = W1.length();
        if (length % 2 == 1) {
            int M1 = length / 2;
            int middleIndex = 0;
            char CharM = W1.charAt(middleIndex);
            
            System.out.println("Middle character: " + CharM);
        } else {
            System.out.println("Error: The word has odd number of characters.");
        }

    }
}
