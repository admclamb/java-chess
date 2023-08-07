package common;

import errors.SquareOccupiedException;
import games.classical.pieces.Piece;

public class Square {

    public Square(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void occupy(Piece piece) throws SquareOccupiedException {
        if (this.currentPiece != null) {
            throw new SquareOccupiedException("Square already occupied");
        }
        this.currentPiece = piece;
    }

    public Piece unoccupy() {
        Piece occupiedPiece = this.currentPiece;
        this.currentPiece = null;
        return occupiedPiece;
    }

    public boolean isOccupied() {
        return this.currentPiece != null;
    }

    public Piece getPiece() {
        return this.currentPiece;
    }

    private String color;
    private Piece currentPiece;
}
