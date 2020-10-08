package shapes;

public class TestShapes
{
    public static void main(String[] args)
    {
        Shape shape = new Shape("Rhombus");
        Circle circle = new Circle(9.7);
        Rectangle rect = new Rectangle(10, 2);

        System.out.println(shape.area()); //?!?!
        System.out.println(circle.area());
        System.out.println(rect.area());
    }
}
