package strategies.playingStrategy;

import Model.Board;
import Model.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board);
}

