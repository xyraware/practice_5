public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String colour, boolean filled) {
        super(colour, filled, side, side);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(length);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(width);
    }

    @Override
    public String toString() {
        if (filled == true)
            return String.format("%17s%10s%5.2f%21s%10s%12s%11s%5.2f%11s%5.2f", "Квадрат: ", "строна- ", width, ", цвет-", color, ", закрашен",", площадь= ",getArea(),", периметр= ",getPerimeter());
        else
            return String.format("%17s%10s%5.2f%21s%10s%12s%11s%5.2f%11s%5.2f", "Квадрат: ", "строна- ", width, ", цвет-", color, ", закрашен",", площадь= ",getArea(),", периметр= ",getPerimeter());
    }
}