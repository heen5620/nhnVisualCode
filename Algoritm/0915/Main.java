public class Main {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fibonacci(10));
    }

    public static long factorial(int number) {

        switch (number) {
            case 0:
                return 1;
            default:
                return number * (factorial(number - 1));
        }

        // if (number == 0) {
        // return 1;
        // }

        // return number * (factorial(number - 1));
    }

    public static long fibonacci(int number) {

        switch (number) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 1;
            default:
                return fibonacci(number - 1) + fibonacci(number - 2);
        }

        // if (number == 0) {
        // return 0;
        // }

        // if (number == 1 || number == 2) {
        // return 1;
        // }

        // return fibonacci(number - 1) + fibonacci(number - 2);

    }
}