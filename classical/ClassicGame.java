package classical;

import common.Board;
import common.Game;
import common.GameValidator;
import common.Move;
import common.Player;
import views.terminal.GameView;
import views.terminal.TerminalView;

public class ClassicGame implements Game {

    public ClassicGame(GameView view) {
        this.isGameOver = false;
        this.whitePlayer = new ClassicPlayer("white");
        this.blackPlayer = new ClassicPlayer("black");
        this.previousMoves = new String[] {};
        this.currentTurn = this.whitePlayer;
        this.view = view;
    }

    public ClassicGame() {
        this.isGameOver = false;
        this.whitePlayer = new ClassicPlayer("white");
        this.blackPlayer = new ClassicPlayer("black");
        this.previousMoves = new String[] {};
        this.currentTurn = this.whitePlayer;
        this.view = new TerminalView();
    }

    public void start() {
        while (!isGameOver) {
            String playerMove = view.getMove(currentTurn);
            Move parsedMove = ClassicGame.VALIDATOR.parseMove(playerMove);
            ClassicGame.VALIDATOR.validate(board, parsedMove);
        }
    }

    public void setup() {
        this.board = new Board();
        this.board.init();
    }

    private void makeTurn() {

    }

    private void render() {
        this.view.render(board);
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
    private GameView view;
    private static final GameValidator VALIDATOR = new ClassicGameValidator();
}
