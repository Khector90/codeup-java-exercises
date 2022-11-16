import java.util.Scanner;


public class Person {
    public String name;
    public static void main(String[] args){
        Person kiley = new Person ("kiley");
        System.out.println(kiley.sayHello());
        System.out.println(kiley.getName());
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);


    }

    public String getName(){
        return this.name;


    }

    public void setName(String name){
        this.name = name;
    }


//   Constructor
     public Person(String newName){
        this.name = newName;
    }
    public String sayHello(){
        return String.format("Hello from hell %s!", name);
    }

}