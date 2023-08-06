package classical.pieces;

public class Rook implements Piece {
    public Rook(String color) {
        this.color = color;
    }

    public String getName() {
        return Rook.NAME;
    }

    public char getNameFirstChar() {
        return Rook.NAME.charAt(0);
    }

    public String getColor() {
        return this.color;
    }

    private String color;
    private static final String NAME = "Rook";
}
