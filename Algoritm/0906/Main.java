public class Main {

    private static double correctCount = 0;

    private static final String[][] TESTCASES = new String[][] {
            { "123", "123", "246" },
            { "1000", "1", "2" },
            { "456", "789", "1461" },
            { "5", "5", "1" },
            { "11112", "54321", "65433" },
            { "3829", "1300", "4139" }
    };

    public static void main(String[] args) {
        for (int i = 0; i < TESTCASES.length; i++)
            System.out.println("Testcase " + i + " = " + test(TESTCASES[i][0], TESTCASES[i][1], TESTCASES[i][2]));

        System.out.println("정답률 = " + (int) (correctCount / TESTCASES.length * 100) + "%");
    }

    private static boolean test(String convertInput, String input2, String answer) {
        int first = Integer.parseInt(convertInput);
        int second = Integer.parseInt(input2);

        boolean res = String.valueOf(solution(first, second)).equals(answer);
        if (res)
            correctCount++;
        return res;
    }

    // solution
    // 숫자를 먼저 뒤집고 , 더하고 , 다시 뒤집기
    // TODO % 나머지를 반환해서 하는방법으로 풀어보기, 재귀함수 써서 함 만들어보기,

    public static int solution(int a, int b) {

        return reversecall(reversecall(a) + reversecall((b)));
    }

    // static int reverse(int n) {
    // String a = Integer.toString(n);
    // String rev = "";

    // for (int i = a.length() - 1; i >= 0; i--) {
    // rev += a.charAt(i);
    // }
    // int revInt = Integer.parseInt(rev);
    // return revInt;
    // }

    static int reversecall(int n) {
        return reverse(n, 0);
    }

    public static int reverse(int n, int reverse) {
        if (n <= 0) {
            return reverse;
        } else {
            reverse = reverse * 10 + n % 10;
            // (123, 0) -> reverse = 3 -> ()
            return reverse(n / 10, reverse);
        }
    }

}