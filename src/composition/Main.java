package composition;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(2, 1);

        Circle c = new Circle(p, 1, "green");
        Square s = new Square(1, "blue");

        // ...
    }
}