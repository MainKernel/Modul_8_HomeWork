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
    public String getShape() {
        return "Circle";
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
