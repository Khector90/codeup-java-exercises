import java.util.Scanner;


public class Person {
    public String name;
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
    public static void main(String[] args){
        Person kiley = new Person ("kiley");
        System.out.println(kiley.sayHello());
        System.out.println(kiley.getName());
    }
}