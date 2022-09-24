public class ShapeTest {
    public static void main(String[] args) {

        Shape circle = new Circle(12, 2, 19);
        Shape square = new Square(8);
        Shape triangle = new EquilateralTriangle(12,5,7);
        Shape rec = new Rectangle(18, 15);
        Shape rom = new Rhombus(32);

        new ShapePrint(circle);
        new ShapePrint(square);
        new ShapePrint(triangle);
        new ShapePrint(rec);
        new ShapePrint(rom);
    }
}