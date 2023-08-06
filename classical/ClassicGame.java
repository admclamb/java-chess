package classical;

import common.Board;
import common.Game;
import common.Player;
import views.gui.GameWindow;

public class ClassicGame implements Game {

    public ClassicGame() {
        this.isGameOver = false;
        this.whitePlayer = new ClassicPlayer("white");
        this.blackPlayer = new ClassicPlayer("black");
        this.previousMoves = new String[] {};
        this.currentTurn = this.whitePlayer;
    }

    public void start() {
        GameWindow.createWindow("Classic Chess", 500, 500);
        while (!isGameOver) {

        }
    }

    public void setup() {
        this.board = new Board();
        this.board.init();
    }

    private void changeTurn() {
        currentTurn = currentTurn.getColor() == "white" ? blackPlayer : whitePlayer;
    }

    private boolean isGameOver;
    private Board board;
    private String[] previousMoves;
    private Player currentTurn;
    private Player whitePlayer;
    private Player blackPlayer;
}
