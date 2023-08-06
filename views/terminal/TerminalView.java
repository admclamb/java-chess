package views.terminal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import common.Board;
import common.Player;
import common.Square;

public class TerminalView implements GameView {

    public TerminalView() {
        this.pieces = new HashMap<String, String>() {
            {
                put("wPawn", "♙");
                put("wKing", "♔");
                put("wRook", "♖");
                put("wKnight", "♘");
                put("wBishop", "♗");
                put("wQueen", "♕");
                put("bPawn", "♟");
                put("bKing", "♚");
                put("bRook", "♜");
                put("bKnight", "♞");
                put("bBishop", "♝");
                put("bQueen", "♛");
            }
        };
    }

    public void render(Board board) {
        for (int rank = board.getLength() - 1; rank >= 0; rank--) {
            String outputLine = (rank + 1) + " ";
            for (int file = 0; file < board.getHeight(); file++) {
                outputLine += " ";
                Square square = board.getSquare(rank, file);
                if (square.isOccupied()) {
                    String pieceName = square.getPiece().getName();
                    outputLine += pieces.get(pieceName);
                } else {
                    outputLine += ".";
                }
            }
            System.out.println(outputLine);
        }
        System.out.println("   ===============");
        System.out.println("   a b c d e f g h");
    }

    public String getMove(Player player) {
        System.out.println(player.getColor() + " move:");
        return TerminalView.scanner.nextLine();
    }

    private Map<String, String> pieces;
    private static final Scanner scanner = new Scanner(System.in);
}
