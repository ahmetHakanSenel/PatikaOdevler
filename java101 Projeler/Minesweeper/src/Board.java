import java.util.Random;

class Board {
    private int rows;
    private int cols;
    private int totalMines;
    private Cell[][] cells;
    private boolean gameFinished;

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.totalMines = rows * cols / 4;
        this.cells = new Cell[rows][cols];
        this.gameFinished = false;
        initializeBoard();
        placeMines();
    }

    private void initializeBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    private void placeMines() {
        Random random = new Random();

        for (int i = 0; i < totalMines; i++) {
            int row, col;
            do {
                row = random.nextInt(rows);
                col = random.nextInt(cols);
            } while (cells[row][col].isMine);

            cells[row][col].setMine(true);
        }
    }

    public void revealCell(int row, int col) {
        if (!isValid(row, col) || cells[row][col].isRevealed) {
            return;
        }

        if (cells[row][col].isMine) {
            gameFinished = true;
            System.out.println("Mayına bastınız! Oyunu kaybettiniz.");
            revealAllMines();
            printBoard();
        } else {
            int minesAround = countMinesAround(row, col);
            cells[row][col].setRevealed(true);
            cells[row][col].setMinesAround(minesAround);

            if (minesAround == 0) {
                revealEmptyCells(row, col);
            }

            if (checkWin()) {
                gameFinished = true;
                System.out.println("Tebrikler! Oyunu kazandınız.");
                printBoard();
            }
        }
    }

    private void revealEmptyCells(int row, int col) {
        int[][] directions = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, -1},           {0, 1},
                {1, -1}, {1, 0}, {1, 1}
        };

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (isValid(newRow, newCol) && !cells[newRow][newCol].isRevealed) {
                revealCell(newRow, newCol);
            }
        }
    }

    private int countMinesAround(int row, int col) {
        int count = 0;
        int[][] directions = {
                {-1, -1}, {-1, 0}, {-1, 1},
                {0, -1},           {0, 1},
                {1, -1}, {1, 0}, {1, 1}
        };

        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            if (isValid(newRow, newCol) && cells[newRow][newCol].isMine) {
                count++;
            }
        }

        return count;
    }

    private boolean isValid(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < cols;
    }

    private void revealAllMines() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (cells[i][j].isMine) {
                    cells[i][j].setRevealed(true);
                }
            }
        }
    }

    private boolean checkWin() {
        int unrevealedCells = rows * cols - totalMines;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!cells[i][j].isRevealed && !cells[i][j].isMine) {
                    return false;
                }
            }
        }

        return unrevealedCells == 0;
    }

    public boolean isGameFinished() {
        return gameFinished;
    }

    public void printBoard() {
        System.out.println("Mayın Tarlası Oyunu");
        System.out.print("   ");
        for (int i = 0; i < cols; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("    -----------");

        for (int i = 0; i < rows; i++) {
            System.out.print(i + "| ");
            for (int j = 0; j < cols; j++) {
                Cell cell = cells[i][j];
                if (cell.isRevealed) {
                    if (cell.isMine) {
                        System.out.print("* ");
                    } else {
                        System.out.print(cell.getMinesAround() + " ");
                    }
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}