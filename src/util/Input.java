package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    // constructor that runs when a new instance is created
    public Input(){
        scanner = new Scanner(System.in);
    }
    public static void main(String[] args) {
    Input userInput = new Input();
        System.out.println("test");
        System.out.println(userInput.scanner.next());

        // creating a new instance of Input class
        Input input2 = new Input();
        System.out.println("input 2 say something");
        String input2InputValue = input2.scanner.next();
        System.out.println(input2InputValue);

        System.out.println(input2.getString());
//        testing yesNo method by instancing it
        input2.yesNo();
        System.out.println(getInt(1,10));
        getInt();
        getDouble();
        getInt(1, 10);
        getDouble(1, 10);

    }



    // methods
    public String getString(){
//        prompting the user
        System.out.println("Do something here!");
//        returning their input
       return scanner.next();
    }

    // this is a method
    // public makes it available -> more on that later
    // boolean -> this method is going to return a value of boolean type
    // yesNo -> just the name of the method
    public boolean yesNo(){
        //prompt a user
        System.out.println("Y/N?");
        // I need a scanner
        String userResp = scanner.next();

        // if the user input is yes set A value to true, going to try a do while loop cause that is what was used in the method exercise or maybe if to assign value. i don't know lost in the sauce
        if (userResp.equalsIgnoreCase("y")){
            System.out.println("You said Yes!");
            return true;
        } else if (userResp.equalsIgnoreCase("N")){
            return false;
        } else {
            yesNo();
        }
        // if the user input is no set A value to false
        // where am I getting the user input?
        // whatvalue am I setting to true/false?

        //How do i call this to get this to run.

        return false;
    }

//    Copied this from teh methods exercise don't know really how to implement it though
    public static int getInt(int min, int max){

        System.out.print("Enter A Numbers between 1 and 10: ");
        int one = scanner.nextInt();
        if (one >= min && one <= max) {
            return one;
        }
        System.out.println("Reenter a number within 1 to 10 please: ");
        return getInt(min, max);
    }


    public static int getInt() {
        System.out.println("enter integer");
        return scanner.nextInt();
    }

        public static double getDouble( int min, int max){

            System.out.print("Enter A double (a number with decimals) between 1 and 10: ");
            double userInput = scanner.nextDouble();
            if (userInput  >= min && userInput  <= max) {
                return userInput;
            }
            System.out.println("Wrong try again: ");
            return getDouble(min, max);
        }

    public static double getDouble(){
        System.out.println("enter a double");
        return scanner.nextDouble();
    }

}
