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
    public String getShape() {
        return "Square";
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