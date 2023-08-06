package classical.pieces;

public class Knight implements Piece {

    public Knight(String color) {
        this.color = color;
    }

    public String getName() {
        return Knight.NAME;
    }

    public char getNameFirstChar() {
        return Knight.NAME.charAt(0);
    }

    public String getColor() {
        return this.color;
    }

    private String color;
    private static final String NAME = "Knight";
}
