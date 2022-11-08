import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        int pie = 3;
        Scanner scanner = new Scanner(System.in);

//        System.out.printf("Please enter a number: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("Is this your number " + userInput);

        System.out.print("Enter a width ");
        int userInput1 = parseInt(scanner.nextLine());
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
        System.out.print("Enter length ");
        int userInput2 = parseInt(scanner.nextLine());

        int totalWidth = userInput1 * userInput2;


        System.out.print(totalWidth);











    }
}
