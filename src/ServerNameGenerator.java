import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;



public class ServerNameGenerator {

    public class Main {
        public static void main(String[] args) {
            int[][] primes = new int[3][3];
            primes[2][2] = 1;

            System.out.println(primes[1][2]);
        }
    }
    public class Marker {
        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(13);
            numbers.add(new Integer(8)); // Line 7
            numbers.add(3.6); // Line 8
            for (Integer number: numbers) System.out.println(number); // Line 9
        }
    }
    class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
    class Employee extends Person {
        private String department;

        public Employee(String name, String department) {
            super(name);
            this.department = department;
        }

        public String getDepartment() {
            return department;
        }
    }
    class CompanyApp {
        public void main(String[] args) {
            Employee emp = new Employee("Peter Gibbons", "IT");
            System.out.println(emp.getName() + " works in " + emp.getDepartment());
        }
    }
}
