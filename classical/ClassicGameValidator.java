package classical;

import common.Board;
import common.GameValidator;
import common.Move;

public class ClassicGameValidator implements GameValidator {

    public boolean validate(Board board, Move move) {
        return true;
    }

    public Move parseMove(String move) {
        return new ClassicMove();
    }
}
