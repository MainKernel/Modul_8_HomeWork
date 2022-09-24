public class ShapeTest {
    public static void main(String[] args) {
        ShapePrint sp = new ShapePrint();
        Shape circle = new Circle(12, 2, 19);
        Shape square = new Square(8);
        Shape triangle = new EquilateralTriangle(12, 5, 7);
        Shape rec = new Rectangle(18, 15);
        Shape rom = new Rhombus(32);

        sp.getShape(circle);
        sp.getShape(square);
        sp.getShape(triangle);
        sp.getShape(rec);
        sp.getShape(rom);

    }
}