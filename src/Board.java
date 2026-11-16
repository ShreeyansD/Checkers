public class Board {
    private Piece[][] grid;

    public Board() {
        grid = new Piece[8][8];
        setup();
    }

    public void setup() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if ((row + col) % 2 == 1) {
                    if (row < 3) {
                        grid[row][col] = new Piece(false);
                    } else if (row > 4) {
                        grid[row][col] = new Piece(true);
                    }
                }
            }
        }
    }

    public void print() {
        IO.println("   a b c d e f g h");
        for (int row = 0; row < grid.length; row++) {
            IO.print(" " + (8-row) + " ");
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] != null) {
                    IO.print(grid[row][col] + " ");
                } else if ((row + col) % 2 == 1) {
                    IO.print(". ");
                } else {
                    IO.print("  ");
                }
            }
            IO.println();
        }
    }

}