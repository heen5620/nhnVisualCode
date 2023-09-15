public class Main {

    public static void main(String[] args) {
        int[] array = { 10, 20, 30, 40 };
        System.out.println(solution(array));

    }

    /*
     * 1. 배열 이용
     * 2. ArrayList 이용
     * 3. 다른 방법???
     */

    public static int solution(int[] input) {
        int max = 0;
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (max < gcd(input[i], input[j])) {
                    max = gcd(input[i], input[j]);
                }
            }
        }

        return max;
    }

    private static int gcd(int first, int second) {
        if (second == 0) {
            return first;
        }
        return gcd(second, first % second);
    }

}