package grades;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student (String studentName) {
        this.name =studentName;
        grades = new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void addGrades(int grade){
        grades.add(grade);

    }
    public double getGradeAverage() {
        int gradeAvg = 0;
        for(int i = 0; i < grades.size(); i++) {
            gradeAvg += grades.get(i);
        }
        return gradeAvg / grades.size();
    }

    public static void main(String[] args) {
        Student kiley = new Student("Kiley");
        kiley.addGrades(75);
        kiley.addGrades(45);
        kiley.addGrades(65);
        kiley.addGrades(25);
        System.out.println(kiley.getGradeAverage());
    }
}
