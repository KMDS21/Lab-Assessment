package Q6;

import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        JFrame F1 =new JFrame("Q06");

        Scanner S1 = new Scanner(System.in);

        System.out.print("Enter width of the frame :");
        int width = Integer.parseInt(S1.nextLine());

        System.out.print("Enter height of the frame :");
        int height = Integer.parseInt(S1.nextLine());

        S1.close();
        F1.setSize(width,height);
        F1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        F1.setVisible(true);



    }
}
