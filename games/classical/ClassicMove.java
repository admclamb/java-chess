package games.classical;

import common.Move;

public class ClassicMove implements Move {
    public ClassicMove(String originalMove) {
        this.originalMove = originalMove;

        this.parse(originalMove);
    }

    private void parse(String move) {
        this.piece = this.getPieceFromMove(move);
    }

    private char getPieceFromMove(String move) {
        return move.charAt(0);
    }

    public String getOriginalMove() {
        return this.originalMove;
    }

    private String originalMove;
    private char piece;
}
