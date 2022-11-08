import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        int pie = 3;
        Scanner scanner = new Scanner(System.in);

//        System.out.printf("Please enter a number: ");
////        int userInput = scanner.nextInt();
//
//        System.out.println("Is this your number " + userInput);

        System.out.print("Please enter 3 words: ");
        String userInput1 = scanner.next();
        String userInput2 = scanner.next();
        String userInput3 = scanner.next();

        System.out.print("Words: " + "\n" + userInput1 + "\n" + userInput2 + "\n" + userInput3);

    }
}
