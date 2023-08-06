package classical.pieces;

public class Bishop implements Piece {

    public Bishop(String color) {
        this.color = color;
    }

    public String getName() {
        return Bishop.NAME;
    }

    public char getNameFirstChar() {
        return Bishop.NAME.charAt(0);
    }

    public String getColor() {
        return this.color;
    }

    private String color;
    private static final String NAME = "Bishop";
}
