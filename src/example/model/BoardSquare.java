package example.model;

import example.ui.CheckersApp;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * BoardSquare is composed of a conditioned pawn
 * A pawn will be set on a boardSquare only if it's location is a valid one(the black squares of the gameboard)
 * It obviously extends javafx.scene.shape Rectangle class to fit the design of our gameboard
 */

public class BoardSquare extends Rectangle {

    private Pawn pawn;

    public BoardSquare(Boolean black, int x, int y) {
        super.setWidth(CheckersApp.SQUARE_SIZE);
        super.setHeight(CheckersApp.SQUARE_SIZE);
        super.setFill(black ? Color.BLACK : Color.WHITESMOKE);
        super.relocate(x * CheckersApp.SQUARE_SIZE, y * CheckersApp.SQUARE_SIZE);
    }

    public boolean hasPawn() {
        return pawn != null;
    }

    public Pawn getPawn() {
        return pawn;
    }

    public void setPawn(Pawn pawn) {
        this.pawn = pawn;
    }
}