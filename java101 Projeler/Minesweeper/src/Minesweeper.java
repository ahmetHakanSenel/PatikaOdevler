import java.util.Scanner;

class Minesweeper {
    private Board board;

    public Minesweeper(int rows, int cols) {
        this.board = new Board(rows, cols);
    }

    public void play() {
        while (!board.isGameFinished()) {
            board.printBoard();
            int row = getUserInput("Satır seçin: ");
            int col = getUserInput("Sütun seçin: ");
            board.revealCell(row, col);
        }
    }

    private int getUserInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }
}