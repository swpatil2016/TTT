package Controller;

import Model.Game;
import Model.GameState;
import Model.Player;
import strategies.winningStrategies.WinningStrategy;


import java.util.List;

public class GameController {

    public Game startGame(int boardDimension, List<Player> players,
                          List<WinningStrategy> winningStrategies) throws Exception {
        return Game.getBuilder()
                .setDimension(boardDimension)
                .setPlayers(players)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void makeMove(Game game) {
        game.makeMove();
    }

    public void displayBoard(Game game) {
        game.printBoard();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void undo(Game game) {
        game.undo();
    }

    public GameState getGameState(Game game) {
        return game.getGameState();
    }
}
