class Cell {
    boolean isMine;
    boolean isRevealed;
    private int minesAround;

    public Cell() {
        this.isMine = false;
        this.isRevealed = false;
        this.minesAround = 0;
    }

    public void setMine(boolean mine) {
        isMine = mine;
    }

    public void setRevealed(boolean revealed) {
        isRevealed = revealed;
    }

    public void setMinesAround(int minesAround) {
        this.minesAround = minesAround;
    }

    public boolean isMine() {
        return isMine;
    }

    public boolean isRevealed() {
        return isRevealed;
    }

    public int getMinesAround() {
        return minesAround;
    }
}