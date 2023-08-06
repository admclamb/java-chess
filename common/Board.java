package common;

import classical.pieces.Bishop;
import classical.pieces.King;
import classical.pieces.Knight;
import classical.pieces.Pawn;
import classical.pieces.Queen;
import classical.pieces.Rook;
import errors.SquareOccupiedException;

public class Board {

    public Board() {
        squareMatrix = new Square[8][8];
        for (int row = 0; row < 8; row++) {
            for (int file = 0; file < 8; file++) {
                // check if even or odd
                if ((row & 1) == 0) {
                    if ((file & 1) == 0) {
                        squareMatrix[row][file] = new Square("black");
                    } else {
                        squareMatrix[row][file] = new Square("white");
                    }
                } else {
                    if ((file & 1) != 0) {
                        squareMatrix[row][file] = new Square("black");
                    } else {
                        squareMatrix[row][file] = new Square("white");
                    }
                }
            }
        }
    }

    public Square[][] getMatrix() {
        return squareMatrix;
    }

    public void init() {
        try {
            // initialize white pieces
            squareMatrix[0][0].occupy(new Rook("white"));
            squareMatrix[0][1].occupy(new Knight("white"));
            squareMatrix[0][2].occupy(new Bishop("white"));
            squareMatrix[0][3].occupy(new Queen("white"));
            squareMatrix[0][4].occupy(new King("white"));
            squareMatrix[0][5].occupy(new Bishop("white"));
            squareMatrix[0][6].occupy(new Knight("white"));
            squareMatrix[0][7].occupy(new Rook("white"));
            squareMatrix[1][0].occupy(new Pawn("white"));
            squareMatrix[1][1].occupy(new Pawn("white"));
            squareMatrix[1][2].occupy(new Pawn("white"));
            squareMatrix[1][3].occupy(new Pawn("white"));
            squareMatrix[1][4].occupy(new Pawn("white"));
            squareMatrix[1][5].occupy(new Pawn("white"));
            squareMatrix[1][6].occupy(new Pawn("white"));
            squareMatrix[1][7].occupy(new Pawn("white"));
            // initialize black pieces
            squareMatrix[7][0].occupy(new Rook("black"));
            squareMatrix[7][1].occupy(new Knight("black"));
            squareMatrix[7][2].occupy(new Bishop("black"));
            squareMatrix[7][3].occupy(new Queen("black"));
            squareMatrix[7][4].occupy(new King("black"));
            squareMatrix[7][5].occupy(new Bishop("black"));
            squareMatrix[7][6].occupy(new Knight("black"));
            squareMatrix[7][7].occupy(new Rook("black"));
            squareMatrix[6][0].occupy(new Pawn("black"));
            squareMatrix[6][1].occupy(new Pawn("black"));
            squareMatrix[6][2].occupy(new Pawn("black"));
            squareMatrix[6][3].occupy(new Pawn("black"));
            squareMatrix[6][4].occupy(new Pawn("black"));
            squareMatrix[6][5].occupy(new Pawn("black"));
            squareMatrix[6][6].occupy(new Pawn("black"));
            squareMatrix[6][7].occupy(new Pawn("black"));
            // fill empty squares
            for (int row = 2; row < 6; row++) {
                for (int file = 0; file < 8; file++) {
                    if ((row & 1) == 0) {
                        if ((file & 1) == 0) {
                            squareMatrix[row][file] = new Square("black");
                        } else {
                            squareMatrix[row][file] = new Square("white");
                        }
                    } else {
                        if ((file & 1) == 0) {
                            squareMatrix[row][file] = new Square("white");
                        } else {
                            squareMatrix[row][file] = new Square("black");
                        }
                    }
                }
            }
        } catch (SquareOccupiedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public Integer getLength() {
        return this.squareMatrix[0].length;
    }

    public Integer getHeight() {
        return this.squareMatrix.length;
    }

    public Square getSquare(Integer rank, Integer file) {
        return this.squareMatrix[rank][file];
    }

    private Square[][] squareMatrix;
}
