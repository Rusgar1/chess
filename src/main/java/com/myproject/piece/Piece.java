package main.java.com.myproject.piece;

import main.java.com.myproject.Color;
import main.java.com.myproject.Coordinates;

abstract public class Piece {
    public static Color color = null;
    public Coordinates coordinates;

    public Piece(Color color, Coordinates coordinates) {
        Piece.color = color;
        this.coordinates = coordinates;
    }

}
