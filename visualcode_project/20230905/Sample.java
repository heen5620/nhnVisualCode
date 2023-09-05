public class Sample {

    public static int sigma1(int start, int end, int step) {
        return calculator((i, j) -> i + j, 0, 1, 10, 1);
    }

    public static int pi(int start, int end, int step) {
        return calculator((i, j) -> i * j, 1, 1, 10, 1);
    }

    private static int calculator(BinaryOp binaryOp, int init, int start, int end, int step) { // BinaryOp binaryOp라는
                                                                                               // 객체를 가져온다라고 표현
        int result = init;
        for (int i = init; i <= end; i += step) {
            result = binaryOp.apply(result, i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(pi(1, 10, 1));
        System.out.println(sigma1(1, 10, 1));
    }

}