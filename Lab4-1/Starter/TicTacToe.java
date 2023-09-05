import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static String[][] board;

    public static void board(String[][] arr) {
        System.out.println();
        System.out.println("----------------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
                System.out.print("  |  ");
            }
            System.out.println();
            System.out.println("----------------");
        }
    }

    public static void userDO(String[][] arr, int x, int y) {
        arr[x][y] = "O";
    }

    public static void computerDO(String[][] arr) {
        Random random = new Random();
        while (true) {
            int x = random.nextInt(3);
            int y = random.nextInt(3);

            if (arr[x][y].equals(" ")) {
                arr[x][y] = "X";
                break;
            }
            if (boardFull(arr) == true) {
                break;
            }
        }
    }

    public static String whoIsWinner(String[][] arr) {
        for (int a = 0; a < 8; a++) {
            String line = null;

            switch (a) {
                case 0:
                    line = arr[0][0] + arr[0][1] + arr[0][2];
                    break;
                case 1:
                    line = arr[1][0] + arr[1][1] + arr[1][2];
                    break;
                case 2:
                    line = arr[2][0] + arr[2][1] + arr[2][2];
                    break;
                case 3:
                    line = arr[0][0] + arr[1][0] + arr[2][0];
                    break;
                case 4:
                    line = arr[0][1] + arr[1][1] + arr[2][1];
                    break;
                case 5:
                    line = arr[0][2] + arr[1][2] + arr[2][2];
                    break;
                case 6:
                    line = arr[0][0] + arr[1][1] + arr[2][2];
                    break;
                case 7:
                    line = arr[0][2] + arr[1][1] + arr[2][0];
                    break;
            }

            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
        }
        if (boardFull(arr)) {
            return "DRAW";
        }

        return "";
    }

    public static boolean boardFull(String[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == " ") {
                    return false;
                }
            }
        }
        return true;
    }

    // 마지막 남은 위치에 내가 입력해 이기거나, 비기거나 둘 중 한 경우 인데,,,, 보드판이 다 찬 경우 검사해서 내가 이긴 경우가 있으면
    // win출력 아니라면 Draw출력을 해야함.

    public static void main(String[] args) {
        board = new String[3][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = " ";
            }
        }

        board(board);

        boolean gameStatus = true;

        while (gameStatus) {
            System.out.print("좌표를 입력해주세요 : ");

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x < 0 || x >= 3 || y < 0 || y >= 3) {
                System.out.println("0부터 2까지의 좌표를 입력하세요.");
                continue;
            }

            if (!board[x][y].equals(" ")) {
                System.out.println("이미 선택된 좌표입니다. 다른 곳을 선택하세요.");
                continue;
            }

            userDO(board, x, y);
            computerDO(board);
            board(board);

            String winner = whoIsWinner(board);
            if (winner.equals("O")) {
                System.out.println("WIN");
                gameStatus = false;
            } else if (winner.equals("X")) {
                System.out.println("LOSE");
                gameStatus = false;
            } else if (winner.equals("DRAW")) {
                System.out.println("DRAW");
                gameStatus = false;
            }
        }
    }
}
