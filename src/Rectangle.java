public class Rectangle extends Shape {
    protected double width, length;

    public Rectangle() {
        super();
        length = 0;
        width = 0;
    }

    public Rectangle(String colour, boolean filled, double width, double length) {
        super(colour, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        if (filled == true)
            return String.format("%17s%10s%5.2f%8s%5.2f%8s%10s%12s%11s%5.2f%11s%5.2f", "Прямоугольник: ", "ширина- ", width, ",длина- ", length, ", цвет-", color, ", закрашен",", площадь= ",getArea(),", периметр= ",getPerimeter());
        else
            return String.format("%17s%10s%5.2f%8s%5.2f%8s%10s%12s%11s%5.2f%11s%5.2f", "Прямоугольник: ", "ширина- ", width, ",длина- ", length, ", цвет-", color, ", закрашен",", площадь= ",getArea(),", периметр= ",getPerimeter());
    }
}