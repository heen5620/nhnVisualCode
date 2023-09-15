public class Main {

    public static void main(String[] args) {
        System.out.println(lcm(1, 1));
        System.out.println(lcm(98, 49));
        System.out.println(lcm(2, 81));
        System.out.println(lcm(3, 7));
        System.out.println(lcm(19, 87));
        System.out.println(lcm(1, 40));
    }

    // private static int solution(int first, int second) {
    // while (second != 0) {
    // int result = first % second;
    // first = second;
    // second = result;
    // }
    // return first;
    // }

    private static int recursiongcd(int first, int second) {
        if (second == 0) {
            return first;
        }
        return recursiongcd(second, first % second);
    }

    private static int lcm(int a, int b) {
        return a * b / recursiongcd(a, b);
    }

}