package shapes;


public class Square extends Rectangle {
    protected int side = 2;

    public Square() {

    }


    public double getParameter(){
        return 4 * side;

    }

    public double getArea(){
        return side * 2;
    }
}



