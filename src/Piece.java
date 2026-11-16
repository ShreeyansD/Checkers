public class Piece {
    private boolean isRed;
    private boolean isKing;

    public Piece(boolean isRed) {
        this.isRed = isRed;
        this.isKing = false;
    }

    public boolean isRed() {
        return isRed;
    }

    public boolean isKing() {
        return isKing;
    }

    public void promote() {
        isKing = true;
    }

    @Override
    public String toString() {
        if (isRed) {
            if (isKing) {
                return "R";
            } else {
                return "r";
            }
        } else {
            if (isKing) {
                return "B";
            } else {
                return "b";
            }
        }
    }
}