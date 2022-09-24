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
    public String getShape() {
        return "Triangle";
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
