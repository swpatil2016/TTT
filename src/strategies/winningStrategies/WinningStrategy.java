package strategies.winningStrategies;

import Model.Board;
import Model.Move;

public interface WinningStrategy {
    boolean checkWinner(Move move, Board board);
}