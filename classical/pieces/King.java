package classical.pieces;

public class King implements Piece {

    public King(String color) {
        this.color = color;
    }

    public String getName() {
        return King.NAME;
    }

    public char getNameFirstChar() {
        return King.NAME.charAt(0);
    }

    public String getColor() {
        return this.color;
    }

    private String color;
    private static final String NAME = "King";
}
