package Model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int dimension;
    private List<List<Cell>> board;

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }

    public Board(int n) {
        //Initialize a board of size * size.
        this.dimension = n;
        board = new ArrayList<>(); // ROWS

        for (int i = 0; i < n; i++) {
            board.add(new ArrayList<>()); //COLS

            for (int j = 0; j < n; j++) {
                board.get(i).add(new Cell(i, j));
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                Cell cell = board.get(i).get(j);
                if (cell.getCellState().equals(CellState.EMPTY)) {
                    System.out.print("|  |");
                } else {
                    System.out.print("|" + cell.getPlayer().getSymbol().getSymbol() + "|");
                }
            }
            System.out.println();
        }
    }
}
