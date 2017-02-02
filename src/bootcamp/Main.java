//Anthony Parker and Norman Wilson
package bootcamp;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Learn your squares and cubes!");

        int n = 1;
        int userInput;
        int square;
        int cube;
        String answer = "y";

        while (answer.equalsIgnoreCase("y")) {


            System.out.println("Enter your integer: ");
            userInput = scan.nextInt();

            System.out.println("Number" + "\t" + "Squared" + "\t" + " Cubed");
            System.out.println("======" + "\t" + "=======" + "\t" + " =====");
            do {
                square = n * n;
                cube = n * n * n;
                System.out.println(n + "\t    " + square + "\t     " + cube);
                n++;
            } while (n <= userInput);
            {
                System.out.println("Continue? (y/n): ");
                answer = scan.next();
            }
        }
    }
}