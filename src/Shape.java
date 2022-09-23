public abstract class Shape {
    public abstract void getShape();
}

class ShapePrint {
    public ShapePrint(Shape shape) {
        shape.getShape();
    }
}

class Circle extends Shape {
    private final double PI = 3.1415926535897932384d;
    private double x;
    private double y;
    private double r;
    private double d;
    private double circleLength;


    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.d = r * 2;
        this.circleLength = d * PI;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setR(double r) {
        this.r = r;
        this.d = r * 2;
        this.circleLength = d * PI;
    }

    public void setD(double d) {
        this.d = d;
        this.r = d / 2;
        this.circleLength = d * PI;
    }

    public void setCircleLength(double circleLength) {
        this.circleLength = circleLength;
        this.d = circleLength / PI;
        this.r = d / 2;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return r;
    }


    public double getD() {
        return d;
    }


    public double getCircleLength() {
        return circleLength;
    }


    @Override
    public String toString() {

        return "Circle position:" + "\nx = " + x + "\ny = " + y + "\nCircle radius: \n" + r
                + "\nCircle diameter: " + d + "\nCircle length: " + circleLength;
    }

    @Override
    public void getShape() {
        System.out.println("Circle");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.x, x) != 0) return false;
        if (Double.compare(circle.y, y) != 0) return false;
        if (Double.compare(circle.r, r) != 0) return false;
        if (Double.compare(circle.d, d) != 0) return false;
        return Double.compare(circle.circleLength, circleLength) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(r);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(d);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(circleLength);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

class Square extends Shape {
    private double x;
    private double y;
    private double side;
    private double perimeter;
    private double squareArea;

    public Square(double x, double y, double side) {
        this(side);
        this.x = x;
        this.y = y;
    }

    public Square(double side) {
        this.side = side;
        this.perimeter = side * 4;
        this.squareArea = side * side;
    }


    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setSide(double side) {
        this.side = side;
        this.perimeter = side * 4;
        this.squareArea = side * side;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
        this.side = perimeter / 4;
        this.squareArea = side * side;
    }

    public void setSquareArea(double squareArea) {
        this.squareArea = squareArea;
        this.side = squareArea / 2;
        this.perimeter = side * 4;
    }

    public double getSide() {
        return side;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getSquareArea() {
        return squareArea;
    }

    @Override
    public String toString() {
        return "Square position:" + "\nx = " + x + "\ny = " + y + "\nSquare side: " + side +
                "\nSquare area: " + squareArea + "\nSquare perimeter: " + perimeter;
    }

    @Override
    public void getShape() {
        System.out.println("Square");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.x, x) != 0) return false;
        if (Double.compare(square.y, y) != 0) return false;
        if (Double.compare(square.side, side) != 0) return false;
        if (Double.compare(square.perimeter, perimeter) != 0) return false;
        return Double.compare(square.squareArea, squareArea) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(side);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(perimeter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(squareArea);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

class EquilateralTriangle extends Shape {
    private double x;
    private double y;
    private double sides;
    private double perimeter;

    public EquilateralTriangle(double sides) {
        this.sides = sides;
        this.perimeter = sides * 3;
    }

    public EquilateralTriangle(double x, double y, double sides) {
        this(sides);
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getSides() {
        return sides;
    }

    public void setSides(double sides) {
        this.sides = sides;
        this.perimeter = sides * 3;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
        this.sides = perimeter / 3;
    }

    @Override
    public String toString() {
        return "Equilateral triangle position: " + "\nx = " + x + "\ny = " + y + "\nEquilateral triangle side: " +
                sides + "\nEquilateral triangle perimeter: " + perimeter;
    }

    @Override
    public void getShape() {
        System.out.println("Triangle");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EquilateralTriangle that = (EquilateralTriangle) o;

        if (Double.compare(that.x, x) != 0) return false;
        if (Double.compare(that.y, y) != 0) return false;
        if (Double.compare(that.sides, sides) != 0) return false;
        return Double.compare(that.perimeter, perimeter) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sides);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(perimeter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

class Rectangle extends Shape {
    private double x;
    private double y;
    private double sideA;
    private double sideB;
    private double p;
    private double area;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.p = 2 * (sideA + sideB);
        this.area = sideA * sideB;

    }

    public Rectangle(double x, double y, double sideA, double sideB) {
        this(sideA, sideB);
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
        this.p = 2 * (sideA + sideB);
        this.area = sideA * sideB;

    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
        this.p = 2 * (sideB + sideA);
        this.area = sideA * sideB;
    }

    public double getP() {
        return p;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle position: \n" + "x = " + x + "\ny = " + y + "\nLength: " + sideA + "\nWidth: " + sideB +
                "\nPerimeter: " + p + "\nArea: " + area;
    }

    @Override
    public void getShape() {
        System.out.println("Rectangle");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (Double.compare(rectangle.x, x) != 0) return false;
        if (Double.compare(rectangle.y, y) != 0) return false;
        if (Double.compare(rectangle.sideA, sideA) != 0) return false;
        if (Double.compare(rectangle.sideB, sideB) != 0) return false;
        if (Double.compare(rectangle.p, p) != 0) return false;
        return Double.compare(rectangle.area, area) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(p);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(area);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

class Rhombus extends Shape {
    private double x;
    private double y;
    private double side;
    private double perimeter;

    public Rhombus(double side) {
        this.side = side;
        this.perimeter = side * 4;
    }

    public Rhombus(double x, double y, double side) {
        this(side);
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        this.perimeter = side * 4;

    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
        this.side = perimeter / 4;
    }

    @Override
    public String toString() {
        return "Rhombus position: " + "\nx = " + x + "\ny = " + y + "\nRhombus side = " + side +
                "\nRhombus perimeter: " + perimeter;
    }

    @Override
    public void getShape() {
        System.out.println("Rhombus");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rhombus rhombus = (Rhombus) o;

        if (Double.compare(rhombus.x, x) != 0) return false;
        if (Double.compare(rhombus.y, y) != 0) return false;
        if (Double.compare(rhombus.side, side) != 0) return false;
        return Double.compare(rhombus.perimeter, perimeter) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(side);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(perimeter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}