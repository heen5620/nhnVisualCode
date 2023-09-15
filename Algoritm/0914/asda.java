import java.math.BigDecimal;

public class asda {
    public static class Fraction {
        private int numerator; // 분자
        private int denominator; // 분모

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;

            normalize();
        }

        public int getNumerator() {
            return numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        public String toString() {
            return this.numerator + "/" + this.denominator;
        }

        public int gcd(int first, int second) {
            if (first < second) {
                int temp = first;
                first = second;
                second = temp;
            }

            if (second == 0) {
                return first;
            }
            return gcd(second, first % second);
        }

        public void normalize() { // 약분
            int gcdNum = gcd(numerator, denominator);
            this.denominator /= gcdNum;
            this.numerator /= gcdNum;
        }

        /**
         * 소수점 값에 대해 자리 수 계산 하는 메서드. <br/>
         * ex) <br/>
         * 0.01 -> 100을 곱하기 위해 2를 return <br/>
         * 0.1 -> 10을 곱하기 위해 1을 return
         *
         *
         * @param num 소수 값
         * @return 소수점 이하 자리 수 값
         */
        public static int getDecimalNumber(BigDecimal num) {
            String str = num.toPlainString();
            String cutting = str.valueOf("\\.");
            // String[] arr = str.split("\\.");
            // return arr[1].length();
            return cutting.length();
        }

        public static String solution(String input) {
            BigDecimal number = new BigDecimal(input);

            int decimalNumber = getDecimalNumber(number);

            double denominator = Math.pow(10, decimalNumber);
            int numerator = (int) (number.doubleValue() * Math.pow(10, decimalNumber));

            return new Fraction(numerator, (int) denominator).toString();
        }

        public static void main(String[] args) {
            System.out.println(solution("0.25"));
        }

    }
}
