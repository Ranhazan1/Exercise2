import java.util.Scanner;

public class TicTacToe {
    public static void printBoard(char[] board) {
        System.out.println(board[0] + "-" + board[1] + "-" + board[2]);
        System.out.println(board[3] + "-" + board[4] + "-" + board[5]);
        System.out.println(board[6] + "-" + board[7] + "-" + board[8]);
    }

    public static boolean isAvailable(char[] board, int position) {
        boolean isAvailable = true;
        if (board[position] == 'X' || board[position] == 'O') {
            isAvailable = false;
        }
        return isAvailable;
    }

    public static int getPositionFromUser(char[] board) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose your position(number between 1-9)");
        int position = scanner.nextInt();
        boolean isAvailable = isAvailable(board, position);
        do {
            if (!isAvailable) {
                System.out.println("this place is taken enter a new one");
                position = scanner.nextInt();
            } else if (position > 9 && position < 1) {
                System.out.println("your  number is illegal ,enter a new one");
                position = scanner.nextInt();
            }
        } while ((position > 9 && position < 1) && (isAvailable));
        return position;
    }

    public static char checkWinner(char[] board) {
        char winner;
        if (board[0] == board[1] && board[0] == board[2]) {
            winner = board[0];
        } else if (board[3] == board[4] && board[3] == board[5]) {
            winner = board[3];
        } else if (board[6] == board[7] && board[6] == board[8]) {
            winner = board[6];
        } else if (board[0] == board[3] && board[0] == board[6]) {
            winner = board[0];
        } else if (board[1] == board[4] && board[1] == board[7]) {
            winner = board[1];
        } else if (board[2] == board[5] && board[2] == board[8]) {
            winner = board[2];
        } else if (board[0] == board[4] && board[0] == board[8]) {
            winner = board[0];
        } else if (board[2] == board[4] && board[2] == board[6]) {
            winner = board[2];
        } else {
            winner = '-';
        }
        return winner;
    }

    public static boolean placeSymbolOnBoard(char[] board, int position, char symbol) {
        board[position] = symbol;
        printBoard(board);
        char winnerSymbol = checkWinner(board);
        boolean winner = true;
        if (winnerSymbol == '-') {
            winner = false;
        }
        return winner;
    }

    public static void main(String[] args) {
        char[] board = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        printBoard(board);
        char player1 = 'X';
        char player2 = 'O';
        boolean isAvailable;
        char winner;
        do {
            System.out.println("player 1 turn");
            int player1Position = getPositionFromUser(board);
            placeSymbolOnBoard(board, player1Position-1, player1);
            winner=checkWinner(board);
            if (winner=='X'||winner=='O'){
                break;
            }
            System.out.println("player 2 turn:");
            int player2Position = getPositionFromUser(board);
            placeSymbolOnBoard(board, player2Position-1, player2);
            winner = checkWinner(board);
            if (winner=='X'||winner=='O'){
                break;
            }

        } while ((winner != 'X') || (winner != 'O'));
        System.out.println("the winner is : "+winner);

    }
}

