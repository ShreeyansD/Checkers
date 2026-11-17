public void main() {
    Board board = new Board();
    String line = IO.readln("Enter move (ex. c3 d4): ");
    int move[] = InputParser.parseMove(line);
    if (move == null) {
        IO.println("Invalid input, use the format c3 d4.");
    } else {
        IO.println("From row " + move[0] + ", col " + move[1] + " to row " + move[2] + ", col " + move[3]);
    }
    board.print();

}