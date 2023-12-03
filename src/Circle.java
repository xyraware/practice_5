public class Circle extends Shape {
    protected double radius;
    public Circle(double radius,String colour, boolean filled) {
        super(colour, filled);
        this.radius = radius;
    }
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        if (filled == true)
            return String.format("%17s%10s%5.2f%21s%10s%12s%11s%5.2f%11s%5.2f", "Круг: ", "радиус- ", radius, ", цвет-", color, ", закрашен",", площадь= ",getArea()," периметр= ",getPerimeter());
        else
            return String.format("%17s%10s%5.2f%21s%10s%12s%11s%5.2f%11s%5.2f", "Круг: ", "радиус- ", radius, ", цвет-", color, ", незакрашен",", площадь= ",getArea()," периметр= ",getPerimeter());
    }
    @Override
    public double getPerimeter() {
        return Math.PI * radius * 2;
    }
}