package classical.pieces;

public class Pawn implements Piece {
    public Pawn(String color) {
        this.color = color;
    }

    public String getName() {
        return Pawn.NAME;
    }

    public char getNameFirstChar() {
        return Pawn.NAME.charAt(0);
    }

    public String getColor() {
        return this.color;
    }

    private String color;
    private static final String NAME = "Pawn";
}
