import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;



public class ArraysExercises {
    //    need to make a main method
    public static <Dogs> void main(String[] args) {
        //    create an array that holds 3 people, iterate through the array and then get it to print out
   String[] Persons = {"Ed", "Edd", "Eddy"};
        System.out.println(Arrays.toString(Persons));

        Dogs[] dog= new Dogs[3];
        dog[0] = new Dogs("Hobie");
        dog[1] = new Dogs("Shimmy");
        dog[2] = new Dogs("Jango");
        Dogs Leai = new Dogs("Leai");

        for(int i = 0; i < dog.length; i++){
            System.out.println(dog[i].getDogs());
        }


   }
//   creating the add person method
    public static Dogs  addDog (){

   String[] Person = new ArrayList[];
   ((ArrayList) Person).add("Edders");

    }

    }



