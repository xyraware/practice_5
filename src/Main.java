public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);
        Shape s2 = new Rectangle("RED", false, 1.0, 2.0);
        Shape s3 = new Square(6.6);
        System.out.println(s1+"\n"+s2+"\n"+s3);
    }
}