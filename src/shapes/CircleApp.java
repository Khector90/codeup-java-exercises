package shapes;
import Util.Input;


public class CircleApp {
    public static void main(String[] args) {
        Input in= new Input();
        boolean again = true;
        again = in.yesNo();

        while(again){
            double radius = Input.getDouble();
            Circle circle = new Circle(radius);
            System.out.println("Area = " + circle.getArea());
            System.out.println("Circumference = " + circle.getCircumference());
            again = in.yesNo();
            System.out.println();


        }
    }
}
