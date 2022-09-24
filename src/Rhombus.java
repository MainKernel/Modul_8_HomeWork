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
    public String getShape() {
       return  "Rhombus";
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