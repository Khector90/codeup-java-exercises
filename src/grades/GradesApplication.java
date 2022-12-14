package grades;

import Util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    static Input input = new Input();
    static boolean running = input.yesNo();

    public static void gradesApp(){
        HashMap<String, Student> Students = new HashMap<>();
        Student  steve = new Student("steve");
        Student bortler = new Student("bortler");
        Student april = new Student("april");
//        steve
        steve.addGrades(76);
        steve.addGrades(75);
        steve.addGrades(55);
//        bortler
        bortler.addGrades(65);
        bortler.addGrades(95);
        bortler.addGrades(85);
//        april
        april.addGrades(75);
        april.addGrades(95);
        april.addGrades(85);

        Students.put("steve420", steve );
        Students.put("bortler420", bortler );
        Students.put("april420", april );

        System.out.println("Pick a loser");
        System.out.println("steve420, bortler420, april420");
        System.out.println("1. view all");
        System.out.println("2. exit");
        label:
        while(running){
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch(input){
                case "steve420":
                    System.out.println("steve " + steve.getGradeAverage());
                    break;
                case "bortler":
                    System.out.println("bortler " + bortler.getGradeAverage());
                    break;
                case "april":
                    System.out.println("april " + april.getGradeAverage());
                    break;
                case "1":
                    Students.forEach((s, student) ->{
                    System.out.println(s + " " + student.getName() + " " + student.getGradeAverage());

                });
                default:
                    System.out.println("Exiting");
                    break label;
            }

        }

    }

    public static void main(String[] args) {
        gradesApp();
    }
}
