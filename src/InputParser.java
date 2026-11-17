public class InputParser {
    public static int[] parseMove(String input) {
        String[] parts = input.trim().toLowerCase().split(" ");
        if (parts.length != 2) {
            return null;
        }
        int[] from = parseSquare(parts[0]);
        int[] to = parseSquare(parts[1]);
        if (from == null || to == null) {
            return null;
        }

        return new int[] {from[0], from[1], to[0], to[1]};
    }

    private static int[] parseSquare(String square) {

        if (square.length() != 2) {
            return null;
        }
        
        char letter = square.charAt(0);
        char number = square.charAt(1);

        if (letter < 'a' || letter > 'h') {
            return null;
        }
        if (number < '1' || number > '8') {
            return null;
        }

        int row = 8 - (number - '0');
        int col = letter - 'a';

        return new int[] {row, col};
    }
}