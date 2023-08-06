package classical.pieces;

public class Queen implements Piece {
    public Queen(String color) {
        this.color = color;
    }

    public String getName() {
        return Queen.NAME;
    }

    public char getNameFirstChar() {
        return Queen.NAME.charAt(0);
    }

    public String getColor() {
        return this.color;
    }

    private String color;
    private static final String NAME = "Queen";
}
