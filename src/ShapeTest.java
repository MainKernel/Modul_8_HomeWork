public class ShapeTest {
    public static void main(String[] args) {

        Circle Circle = new Circle(12, 2, 19);
        Square Square = new Square(8);
        EquilateralTriangle tri = new EquilateralTriangle(12,5,7);
        Rectangle rec = new Rectangle(18, 15);
        Rhombus rom = new Rhombus(32);

        new ShapePrint(Circle);
        new ShapePrint(Square);
        new ShapePrint(tri);
        new ShapePrint(rec);
        new ShapePrint(rom);
    }
}