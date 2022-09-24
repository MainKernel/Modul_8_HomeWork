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
    public String getShape() {
        return "Rectangle";
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