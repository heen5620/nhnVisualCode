import java.util.Scanner;

public class Sample {

    int add(int i, int j) {
        return i + j;
    }

    static int add(int i, double d) {
        return i + (int) d;
    }

    public static void main(String[] args) {
        double s = 5.0d;

        int result = add(1, s);
    }

}
