package shapes;

public class ShapesTest {



    public static void main(String[] args) {

        Square squareOne = new Square(2);
        Rectangle box2 = new Rectangle(2, 2);
        System.out.println(squareOne.getPerimeter());
        System.out.println(squareOne.getArea());
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());

    }

}

