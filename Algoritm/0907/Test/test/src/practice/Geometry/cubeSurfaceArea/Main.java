package practice.Geometry.cubeSurfaceArea;

public class Main {

    double length; // 한변의 길이 혹은 세로
    double width; // 가로
    double height; // 높이

    public Main(double length) {
        if (length <= 0)
            throw new IllegalArgumentException("0보다 큰 값이 들어와야합니다.");
        this.length = length;
    }

    public Main(double length, double width) {
        if (length <= 0 || width <= 0)
            throw new IllegalArgumentException("0보다 큰 값이 들어와야합니다.");
        this.length = length;
        this.width = width;
    }

    public Main(double length, double width, double height) {
        if (length <= 0 || width <= 0)
            throw new IllegalArgumentException("0보다 큰 값이 들어와야합니다.");
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public static double areaBox(double length) {
        return (length * length) * 6;
    }

    public static double areaCube(double width, double length, double height) {
        return (2 * length * width) + (2 * length * height) + (2 * height * width);
    }

    public static double areaRectengle(double width, double length) {
        return width * length;
    }

    public static double areaSquare(double length) {
        return length * length;
    }

    public Double getLength() {
        return length;
    }

}
