package common;

public interface GameValidator {
    public boolean validate(Board board, Move move);

    public Move parseMove(String move);
}
