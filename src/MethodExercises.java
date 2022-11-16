import java.util.Scanner;

public class MethodExercises {
        public static void main(String[] args) {
        int first, second, add, subtract, multiply;
        float divide;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Two Numbers : ");
        first = scanner.nextInt();
        second = scanner.nextInt();

        add = first + second;
        subtract = first - second;
        multiply = first * second;
        divide = (float) first / second;

        System.out.println("Sum = " + add);
        System.out.println("Difference = " + subtract);
        System.out.println("Multiplication = " + multiply);
        System.out.println("Division = " + divide);


        // prompt user for number
            // save that number in 'userInput' = getInteger(1,10)
        getInteger(1, 10);
    }
    public static int getInteger(int min, int max) {

        // made a method
        // made a scanner -> asks for prompt && saves the user input to variables
        // need to set range between 1-10
        // if userInput is NOT between range -> prompt again and repeat steps
        //

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter A Numbers between 1 and 10: ");
        int one = scanner.nextInt();


        // if one < 1 or userInput > 10 .... prompt user again! (recursion - calling a method within itself)
        if (one >= min && one <= max) {
            return one;
        }
        System.out.println("Reenter a number within 1 to 10 please: ");
        return getInteger(min, max);

    }
}
