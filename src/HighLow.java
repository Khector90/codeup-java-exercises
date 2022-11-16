import java.util.Scanner;


public class HighLow {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("want to play a game?");
        double myNum = Math.floor(Math.random() * 100);
        int randNum = (int)myNum;
        System.out.println("Guess a number");

        int userInput;
        do{
            System.out.println("Choose a number btw 1-100");
            userInput = sc.nextInt();
            MethodExercises.getInterger(1, 100);

            if(userInput > randNum){
                System.out.println("Lower that number brah");
            } else if (userInput < randNum) {
                System.out.println("Up, up");
            } else {
                System.out.println("Lucky guess");
            }
        }while(userInput != randNum);
        System.out.println("Game over brah!");
    }
}
