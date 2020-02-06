package composition;

public class Square extends Shape {
    private Point corner;
    private double size;

    public Square(double size, String color) {
        super(color);
        this.corner = new Point(1,1);
        this.size = size;
    }

    @Override
    public double getArea() {
        return size * size;
    }

    @Override
    public String toString() {
        return String.format("Square {corner: %s, size: %.2f, color: %s}", corner, size, getColor());
    }
}
