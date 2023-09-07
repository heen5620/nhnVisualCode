package practice.Geometry.cubeSurfaceArea;

/*
 * 직육면체 겉넓이 함수 구현
 */

public class box {

    double length;

    public box(double length) {
        if (length <= 0)
            throw new IllegalArgumentException("Invalid input!");
        this.length = length;
    }

    public double area(double length) {
        return (length * length) * 6;
    }

    public double getLength() {
        return length;
    }

}