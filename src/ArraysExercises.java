import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;



public class ArraysExercises {

    //    need to make a main method
    public static <Dogs> void main(String[] args) {
        //    create an array that holds 3 people, iterate through the array and then get it to print out
   String[] Persons = {"Ed", "Edd", "Eddy"};
        System.out.println(Arrays.toString(Persons));
        String [] addPerson = Arrays.copyOf(Persons, Persons.length +1);
        addPerson[Persons.length] = "bert";

        for(String people: addPerson){
            System.out.println(people);
            System.out.println(Arrays.toString(addPerson));
        }

//        Dogs[] dog= new Dogs[3];
//        dog[0] = new Dogs("Hobie");
//        dog[1] = new Dogs("Shimmy");
//        dog[2] = new Dogs("Jango");






   }
//   creating the add person method
    int five = 5;
//    public static void addPerson(Person[] array, Person newPerson){
//        String addPerson = Arrays.copyof(Persons, Persons.length +1);
//
//    }

    }



