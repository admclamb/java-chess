package views.terminal;

import common.Board;
import common.Player;

public interface GameView {
    public void render(Board board);

    public String getMove(Player player);
}
