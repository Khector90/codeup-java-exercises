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
            System.out.println(getInteger(1, 10));

            String userResp;
            do{
                int userInput = getInteger(1, 10);
                factorial(userInput);
                System.out.println("Would like to keep going?(y/n)");
                userResp = scanner.next();

            }while(userResp.equalsIgnoreCase("y"));

            System.out.println("Welcome to dice!");
            String userRes;
            do{
                System.out.println("What sided dice you using brah?");
                int userInput = scanner.nextInt();
                System.out.println("Roll motherfluffer (Y/N)");
                String userChoice = scanner.next();
                if (userChoice.equalsIgnoreCase("y")){
                    System.out.println("first result: " + dice(userInput));
                    System.out.println("second result: " + dice(userInput));
                }
                System.out.println("Want to keep rolling?(y/n");
                userRes =scanner.next();
            } while(userRes.equalsIgnoreCase("y"));
            System.out.println("Thanks for the money");

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
//    question 3
    public static long factorial(int num){
            long solution = 1;
            String fact = "";
            for (int i = 1; i <= num; i++ ){
                solution *= i;
                if(i == 1){
                    String stringFactorial = " " + i + "! = ";
                    fact += i;
                    System.out.println(stringFactorial + fact + "=" + solution);
                }else{
                    String stringFactorial = " " + i + "! = ";
                    fact += " X " + i;
                    System.out.println(stringFactorial + fact + "=" + solution);
                }
            }
        return solution;
    }
//    question 4
    public static int dice(int sides){
            double diceRoll = Math.floor(Math.random() * sides);
            int intRoll = (int)diceRoll;
            return intRoll;

    }

}
